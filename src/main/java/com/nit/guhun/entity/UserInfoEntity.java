package com.nit.guhun.entity;

import java.util.Date;

public class UserInfoEntity {
    private String userId;
    private String userEmpId;
    private String userRight;
    private String empId;
    private String empName;
    private String empSex;
    private Integer empAge;
    private String empTel;
    private String empJob;
    private String empHobby;
    private String empMsg;
    private Date   empDate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserEmpId() {
        return userEmpId;
    }

    public void setUserEmpId(String userEmpId) {
        this.userEmpId = userEmpId;
    }

    public String getUserRight() {
        return userRight;
    }

    public void setUserRight(String userRight) {
        this.userRight = userRight;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
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
        this.empTel = empTel;
    }

    public String getEmpJob() {
        return empJob;
    }

    public void setEmpJob(String empJob) {
        this.empJob = empJob;
    }

    public String getEmpHobby() {
        return empHobby;
    }

    public void setEmpHobby(String empHobby) {
        this.empHobby = empHobby;
    }

    public String getEmpMsg() {
        return empMsg;
    }

    public void setEmpMsg(String empMsg) {
        this.empMsg = empMsg;
    }

    public Date getEmpDate() {
        return empDate;
    }

    public void setEmpDate(Date empDate) {
        this.empDate = empDate;
    }
}
