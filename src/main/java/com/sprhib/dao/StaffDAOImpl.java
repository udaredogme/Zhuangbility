package com.sprhib.dao;


import com.sprhib.model.Staff;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StaffDAOImpl implements StaffDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addStaff(Staff staff) {
        getCurrentSession().save(staff);
    }

    public void updateStaff(Staff staff) {
        Staff staffToUpdate = getStaff(staff.getId());
        staffToUpdate.setName(staff.getName());
        staffToUpdate.setCollege(staff.getCollege());
        staffToUpdate.setSpeclity(staff.getSpeclity());
        staffToUpdate.setStfID(staff.getStfID());
    }

    public Staff getStaff(int id){
        Staff staff = (Staff) getCurrentSession().get(Staff.class, id);
        return staff;
    }

    public void deleteStaff(int id){
        Staff staff = getStaff(id);
        if(staff != null)
        {
            getCurrentSession().delete(staff);
        }
    }

    @SuppressWarnings("unchecked")
    public List<Staff> getStaffs()
    {
        return getCurrentSession().createQuery("from Staff").list();
    }
}