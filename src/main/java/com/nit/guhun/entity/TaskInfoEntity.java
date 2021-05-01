package com.nit.guhun.entity;


import java.util.Date;

public class TaskInfoEntity {

    private Integer task_id;
    private String user_id;
    private String emp_name;
    private Integer job_id;
    private String job_title;
    private String job_main;
    private String job_site_id;
    private Date job_add_time;
    private Integer map_id;

    public Integer getMap_id() {
        return map_id;
    }

    public void setMap_id(Integer map_id) {
        this.map_id = map_id;
    }

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Integer getJob_id() {
        return job_id;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getJob_main() {
        return job_main;
    }

    public void setJob_main(String job_main) {
        this.job_main = job_main;
    }

    public String getJob_site_id() {
        return job_site_id;
    }

    public void setJob_site_id(String job_site_id) {
        this.job_site_id = job_site_id;
    }

    public Date getJob_add_time() {
        return job_add_time;
    }

    public void setJob_add_time(Date job_add_time) {
        this.job_add_time = job_add_time;
    }
}
