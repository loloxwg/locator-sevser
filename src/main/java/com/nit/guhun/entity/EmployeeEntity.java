package com.nit.guhun.entity;

import java.util.Date;

public class EmployeeEntity {
    private String empId;

    private String empName;

    private String empSex;

    private Integer empAge;

    private String empTel;

    private String empJob;

    private String empHobby;

    private String empMsg;

    private Date empDate;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex == null ? null : empSex.trim();
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public String getEmpTel() {
        return empTel;
    }

    public void setEmpTel(String empTel) {
        this.empTel = empTel == null ? null : empTel.trim();
    }

    public String getEmpJob() {
        return empJob;
    }

    public void setEmpJob(String empJob) {
        this.empJob = empJob == null ? null : empJob.trim();
    }

    public String getEmpHobby() {
        return empHobby;
    }

    public void setEmpHobby(String empHobby) {
        this.empHobby = empHobby == null ? null : empHobby.trim();
    }

    public String getEmpMsg() {
        return empMsg;
    }

    public void setEmpMsg(String empMsg) {
        this.empMsg = empMsg == null ? null : empMsg.trim();
    }

    public Date getEmpDate() {
        return empDate;
    }

    public void setEmpDate(Date empDate) {
        this.empDate = empDate;
    }
}