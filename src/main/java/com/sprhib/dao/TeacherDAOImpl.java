package com.sprhib.dao;

import com.sprhib.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class TeacherDAOImpl implements TeacherDAO
{
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession()
    {
        return sessionFactory.getCurrentSession();
    }

    public void addTeacher(Teacher teacher)
    {
        getCurrentSession().save(teacher);
    }

    public void updateTeacher(Teacher teacher)
    {
        Teacher teacherToUpdate = getTeacher(teacher.getId());
        teacherToUpdate.setName(teacher.getName());
        teacherToUpdate.setCollege(teacher.getCollege());
        teacherToUpdate.setSpeclity(teacher.getSpeclity());
        teacherToUpdate.settID(teacher.gettID());
    }

    public Teacher getTeacher(int id)
    {
        Teacher teacher = (Teacher) getCurrentSession().get(Teacher.class,id);
        return teacher;
    }

    public void deleteTeacher(int id)
    {
        Teacher teacher = getTeacher(id);
        if(teacher != null)
        {
            getCurrentSession().delete(teacher);
        }
    }

    @SuppressWarnings("unchecked")
    public List<Teacher> getTeachers()
    {
        return getCurrentSession().createQuery("from  Teacher").list();
    }

}
