package com.sprhib.dao;

import com.sprhib.model.Course;

import java.util.List;


public interface CourseDAO
{
    public void addCourse(Course course);
    public void updateCourse(Course course);
    public Course getCourse(int id);
    public void deleteCourse(int id);
    public List<Course> getCourses();
}
