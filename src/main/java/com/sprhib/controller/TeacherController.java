package com.sprhib.controller;

import com.sprhib.model.Teacher;
import com.sprhib.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController
{
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public ModelAndView addTeacherPage()
    {
        ModelAndView modelAndView = new ModelAndView("add-teacher-form");
        modelAndView.addObject("teacher",new Teacher());
        return modelAndView;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ModelAndView addingTeacher(@ModelAttribute Teacher teacher)
    {
        ModelAndView modelAndView = new ModelAndView("overview");
        teacherService.addTeacher(teacher);

        String message = "Teacher was successfully added.";
        modelAndView.addObject("message",message);

        return modelAndView;
    }

    @RequestMapping(value = "/list")
    public ModelAndView listOfTeachers()
    {
        ModelAndView modelAndView = new ModelAndView("list-of-teachers");

        List<Teacher> teachers = teacherService.getTeachers();
        modelAndView.addObject("teachers",teachers);

        return modelAndView;
    }
}
