package com.sprhib.dao;

import com.sprhib.model.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDAOImpl implements CourseDAO
{
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public void addCourse(Course course)
    {
        getCurrentSession().save(course);
    }

    public void updateCourse(Course course)
    {
        Course courseToUpdate = getCourse(course.getId());
        courseToUpdate.setName(course.getName());
        courseToUpdate.setcID(course.getcID());
        courseToUpdate.setTime(course.getTime());
        courseToUpdate.setValue(course.getValue());
    }

    public Course getCourse(int id)
    {
        Course course = (Course) getCurrentSession().get(Course.class,id);
        return course;
    }

    public void deleteCourse(int id)
    {
        Course course = getCourse(id);
        if(course != null)
        {
            getCurrentSession().delete(course);
        }
    }

    @SuppressWarnings("unchecked")
    public List<Course> getCourses()
    {
        return getCurrentSession().createQuery("from Course").list();
    }

}
