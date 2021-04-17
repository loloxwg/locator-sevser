package com.nit.guhun.entity;

import java.util.Date;

public class WiFiEntity {
    private Integer wifiId;

    private Integer wifiSiteId;

    private Integer wifiGridX;

    private Integer wifiGridY;

    private String wifiSignal;

    private Date wifiLastTime;

    private Date wifiAddTime;

    public Integer getWifiId() {
        return wifiId;
    }

    public void setWifiId(Integer wifiId) {
        this.wifiId = wifiId;
    }

    public Integer getWifiSiteId() {
        return wifiSiteId;
    }

    public void setWifiSiteId(Integer wifiSiteId) {
        this.wifiSiteId = wifiSiteId;
    }

    public Integer getWifiGridX() {
        return wifiGridX;
    }

    public void setWifiGridX(Integer wifiGridX) {
        this.wifiGridX = wifiGridX;
    }

    public Integer getWifiGridY() {
        return wifiGridY;
    }

    public void setWifiGridY(Integer wifiGridY) {
        this.wifiGridY = wifiGridY;
    }

    public String getWifiSignal() {
        return wifiSignal;
    }

    public void setWifiSignal(String wifiSignal) {
        this.wifiSignal = wifiSignal == null ? null : wifiSignal.trim();
    }

    public Date getWifiLastTime() {
        return wifiLastTime;
    }

    public void setWifiLastTime(Date wifiLastTime) {
        this.wifiLastTime = wifiLastTime;
    }

    public Date getWifiAddTime() {
        return wifiAddTime;
    }

    public void setWifiAddTime(Date wifiAddTime) {
        this.wifiAddTime = wifiAddTime;
    }
}