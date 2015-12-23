package com.sprhib.controller;

import com.sprhib.model.Staff;
import com.sprhib.model.Student;
import com.sprhib.model.Teacher;
import com.sprhib.service.StaffService;
import com.sprhib.service.StudentService;
import com.sprhib.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;



@Controller
@RequestMapping("/editinfo")
public class editController
{
    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StaffService staffService;

    @RequestMapping()
    public ModelAndView goEdit()
    {
        ModelAndView modelAndView = new ModelAndView("edit");
        List<Student> students = studentService.getStudents();
        modelAndView.addObject("students",students);
        List<Teacher> teachers = teacherService.getTeachers();
        modelAndView.addObject("teachers",teachers);
        return modelAndView;
    }


    @RequestMapping(value = "/edit_stu/{id}",method = RequestMethod.GET)
    public ModelAndView editStudentPage(@PathVariable Integer id)
    {
        ModelAndView modelAndView = new ModelAndView("edit-student-form");
        Student student = studentService.getStudent(id);
        modelAndView.addObject("student",student);
        return modelAndView;
    }

    @RequestMapping(value = "/edit_stu/{id}", method = RequestMethod.POST)
    public ModelAndView editingStudent(@ModelAttribute Student student, @PathVariable Integer id)
    {
        ModelAndView modelAndView = new ModelAndView("overview");
        studentService.updateStudent(student);
        String message = "Student was successfully edited.";
        modelAndView.addObject("message",message);

        return modelAndView;
    }

    @RequestMapping(value = "/delete_stu/{id}",method = RequestMethod.GET)
    public ModelAndView deleteStudent(@PathVariable Integer id)
    {
        ModelAndView modelAndView = new ModelAndView("overview");
        studentService.deleteStudent(id);
        String message = "Student was successfully deleted.";
        modelAndView.addObject("message", message);
        return modelAndView;
    }

    @RequestMapping(value = "/edit_tea/{id}",method = RequestMethod.GET)
    public ModelAndView editTeacherPage(@PathVariable Integer id)
    {
        ModelAndView modelAndView = new ModelAndView("edit-teacher-form");
        Teacher teacher = teacherService.getTeacher(id);
        modelAndView.addObject("teacher",teacher);
        return modelAndView;
    }

    @RequestMapping(value = "/edit_tea/{id}",method = RequestMethod.POST)
    public ModelAndView editingTeacher(@ModelAttribute Teacher teacher,@PathVariable Integer id)
    {
        ModelAndView modelAndView = new ModelAndView("overview");
        teacherService.updateTeacher(teacher);
        String message = "Teacher was successfully edited.";
        modelAndView.addObject("message",message);
        return modelAndView;
    }

    @RequestMapping(value = "/delete_tea/{id}",method = RequestMethod.GET)
    public ModelAndView deleteTeacher(@PathVariable Integer id)
    {
        ModelAndView modelAndView = new ModelAndView("overview");
        teacherService.deleteTeacher(id);
        String message = "Teacher was successfully deleted.";
        modelAndView.addObject("message",message);
        return modelAndView;
    }

    @RequestMapping(value = "/edit_stf/{id}" ,method = RequestMethod.GET)
    public ModelAndView editStaff(@PathVariable Integer id)
    {
        ModelAndView modelAndView = new ModelAndView("edit-staff-form");
        Staff staff = staffService.getStaff(id);
        modelAndView.addObject("staff",staff);
        return modelAndView;
    }

    @RequestMapping(value = "/edit_stf/{id}",method = RequestMethod.POST)
    public ModelAndView editingStaff(@ModelAttribute Staff staff,@PathVariable Integer id)
    {
        ModelAndView modelAndView = new ModelAndView("overview");
        staffService.updateStaff(staff);
        String message = "Staff was successfully edited";
        modelAndView.addObject("message",message);
        return modelAndView;
    }

    @RequestMapping(value = "/delete_stf/{id}",method = RequestMethod.GET)
    public ModelAndView deleteStaff(@PathVariable Integer id)
    {
        ModelAndView modelAndView = new ModelAndView("overview");
        staffService.deleteStaff(id);
        String message = "Staff was seccessfully deleted.";
        modelAndView.addObject("message",message);
        return modelAndView;
    }

}
