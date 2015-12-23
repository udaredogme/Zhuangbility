package com.sprhib.service;


import com.sprhib.dao.StaffDAO;
import com.sprhib.model.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StaffServiceImpl implements StaffService
{
    @Autowired
    private StaffDAO staffDAO;

    public void addStaff(Staff staff){
        staffDAO.addStaff(staff);
    }

    public void updateStaff(Staff staff){
        staffDAO.updateStaff(staff);
    }

    public Staff getStaff(int id) {
       return staffDAO.getStaff(id);
    }

    public void deleteStaff(int id){
        staffDAO.deleteStaff(id);
    }

    public List<Staff> getStaffs() {
        return staffDAO.getStaffs();
    }
}
