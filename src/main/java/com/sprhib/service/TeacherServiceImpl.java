package com.sprhib.service;

import com.sprhib.dao.TeacherDAO;
import com.sprhib.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by SunskyXH on 15/12/20.
 */
@Service
@Transactional
public class TeacherServiceImpl implements TeacherService
{
    @Autowired
    private TeacherDAO teacherDAO;

    public void addTeacher(Teacher teacher)
    {
        teacherDAO.addTeacher(teacher);
    }

    public void updateTeacher(Teacher teacher)
    {
        teacherDAO.updateTeacher(teacher);
    }

    public Teacher getTeacher(int id)
    {
        return teacherDAO.getTeacher(id);
    }

    public void deleteTeacher(int id) {
        teacherDAO.deleteTeacher(id);
    }

    @Override
    public List<Teacher> getTeachers() {
        return teacherDAO.getTeachers();
    }
}
