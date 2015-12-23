package com.sprhib.service;

import com.sprhib.model.Student;
import com.sprhib.model.Teacher;

import java.util.List;

/**
 * Created by SunskyXH on 15/12/20.
 */
public interface TeacherService {
    public void addTeacher(Teacher teacher);
    public void updateTeacher(Teacher teacher);
    public Teacher getTeacher(int id);
    public void deleteTeacher(int id);
    public List<Teacher> getTeachers();
}
