package com.sprhib.dao;

import com.sprhib.model.Staff;

import java.util.List;

/**
 * Created by SunskyXH on 15/12/21.
 */
public interface StaffDAO
{
    public void addStaff(Staff staff);
    public void updateStaff(Staff staff);
    public Staff getStaff(int id);
    public void deleteStaff(int id);
    public List<Staff> getStaffs();
}
