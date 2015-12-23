package com.sprhib.controller;

import com.sprhib.model.Staff;
import com.sprhib.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController
{
    @Autowired
    private StaffService staffService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public ModelAndView addStaff()
    {
        ModelAndView modelAndView = new ModelAndView("add-staff-form");
        modelAndView.addObject("staff",new Staff());
        return modelAndView;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ModelAndView addingStaff(@ModelAttribute Staff staff)
    {
        ModelAndView modelAndView = new ModelAndView("overview");
        staffService.addStaff(staff);

        String message = "Staff was successfully added.";
        modelAndView.addObject("message",message);

        return modelAndView;
    }
    @RequestMapping(value = "/list")
    public ModelAndView listOfStaffs()
    {
        ModelAndView modelAndView = new ModelAndView("list-of-staffs");

        List<Staff> staffs = staffService.getStaffs();
        modelAndView.addObject("staffs",staffs);

        return modelAndView;
    }

}
