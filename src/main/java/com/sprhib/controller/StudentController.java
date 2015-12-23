package com.sprhib.controller;

import java.util.List;

import com.sprhib.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sprhib.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController
{
@Autowired
private StudentService studentService;

@RequestMapping(value = "/add",method=RequestMethod.GET)
public ModelAndView addStudentPage()
{
ModelAndView modelAndView = new ModelAndView("add-student-form");
modelAndView.addObject("student",new Student());
return modelAndView;
}

@RequestMapping(value = "/add",method = RequestMethod.POST)
public ModelAndView addingStudent(@ModelAttribute Student student)
{
ModelAndView modelAndView = new ModelAndView("overview");
studentService.addStudent(student);

String message = "Student was successfully added.";
modelAndView.addObject("message",message);

return modelAndView;
}

	@RequestMapping(value = "/list")
	public ModelAndView listOfStudents()
	{
		ModelAndView modelAndView = new ModelAndView("list-of-students");

		List<Student> students = studentService.getStudents();
		modelAndView.addObject("students",students);

		return modelAndView;
	}

}
