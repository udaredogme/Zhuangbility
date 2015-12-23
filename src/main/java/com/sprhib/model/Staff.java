package com.sprhib.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by SunskyXH on 15/12/21.
 */

@Entity
@Table(name ="staffs" )
public class Staff
{
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String college;
    private String speclity;
    private String stfID;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getSpeclity() {
        return speclity;
    }

    public void setSpeclity(String speclity) {
        this.speclity = speclity;
    }

    public String getStfID() {
        return stfID;
    }

    public void setStfID(String stfID) {
        this.stfID = stfID;
    }
}
