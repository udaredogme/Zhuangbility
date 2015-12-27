package com.sprhib.service;


import com.sprhib.model.Course;

import java.util.List;

public interface CourseService
{
    public void addCourse(Course course);
    public void updateCourse(Course course);
    public Course getCourse(int id);
    public void deleteCourse(int id);
    public List<Course> getCourses();
}
