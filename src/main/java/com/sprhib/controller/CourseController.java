package com.sprhib.controller;

import com.sprhib.model.Course;
import com.sprhib.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController
{
    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public ModelAndView addCoursePage()
    {
        ModelAndView modelAndView = new ModelAndView("add-course-form");
        modelAndView.addObject("course",new Course());
        return modelAndView;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ModelAndView addingCourse(@ModelAttribute Course course)
    {
        ModelAndView modelAndView = new ModelAndView("overview");
        courseService.addCourse(course);

        String message = "Course was successfully added.";
        modelAndView.addObject("message",message);
        return  modelAndView;
    }

    @RequestMapping(value = "/list")
    public ModelAndView listOfCourses()
    {
        ModelAndView modelAndView = new ModelAndView("list-of-courses");
        List<Course> courses = courseService.getCourses();
        modelAndView.addObject("courses",courses);

        return modelAndView;
    }

}
