package com.nit.guhun.entity;

import java.util.Date;

public class JobUserEntity {
    private int job_id;
    private String job_title;
    private String job_main;
    private int map_id;
    private int site_id;
    private String site_name;
    private String users_id_name;
    private Date job_add_time;

    public int getMap_id() {
        return map_id;
    }

    public void setMap_id(int map_id) {
        this.map_id = map_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getSite_id() {
        return site_id;
    }

    public void setSite_id(int site_id) {
        this.site_id = site_id;
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

    public String getSite_name() {
        return site_name;
    }

    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    public String getUsers_id_name() {
        return users_id_name;
    }

    public void setUsers_id_name(String users_id_name) {
        this.users_id_name = users_id_name;
    }

    public Date getJob_add_time() {
        return job_add_time;
    }

    public void setJob_add_time(Date job_add_time) {
        this.job_add_time = job_add_time;
    }
}
