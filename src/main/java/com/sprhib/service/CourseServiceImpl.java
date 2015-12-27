package com.sprhib.service;

import com.sprhib.dao.CourseDAO;
import com.sprhib.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService
{
    @Autowired
    private CourseDAO courseDAO;

    public void addCourse(Course course)
    {
        courseDAO.addCourse(course);
    }

    public void updateCourse(Course course)
    {
        courseDAO.updateCourse(course);
    }

    public Course getCourse(int id)
    {
        return courseDAO.getCourse(id);
    }

    public void deleteCourse(int id)
    {
        courseDAO.deleteCourse(id);
    }

    public List<Course> getCourses() {
        return courseDAO.getCourses();
    }
}
