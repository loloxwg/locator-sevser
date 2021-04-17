package com.nit.guhun.entity;

import java.util.Date;

public class UserEntity {
    private String userId;

    private String userPwd;

    private String userEmpId;

    private Integer userWifiId;

    private Date userLastTime;

    private String userRight;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserEmpId() {
        return userEmpId;
    }

    public void setUserEmpId(String userEmpId) {
        this.userEmpId = userEmpId == null ? null : userEmpId.trim();
    }

    public Integer getUserWifiId() {
        return userWifiId;
    }

    public void setUserWifiId(Integer userWifiId) {
        this.userWifiId = userWifiId;
    }

    public Date getUserLastTime() {
        return userLastTime;
    }

    public void setUserLastTime(Date userLastTime) {
        this.userLastTime = userLastTime;
    }

    public String getUserRight() {
        return userRight;
    }

    public void setUserRight(String userRight) {
        this.userRight = userRight == null ? null : userRight.trim();
    }
}