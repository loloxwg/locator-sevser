package com.nit.guhun.entity;

import java.util.Date;

public class SiteEntity {
    private Integer siteId;

    private String siteName;

    private String siteLocate;

    private String siteMapId;

    private String siteAttribute;

    private Date siteDate;

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    public String getSiteLocate() {
        return siteLocate;
    }

    public void setSiteLocate(String siteLocate) {
        this.siteLocate = siteLocate == null ? null : siteLocate.trim();
    }

    public String getSiteMapId() {
        return siteMapId;
    }

    public void setSiteMapId(String siteMapId) {
        this.siteMapId = siteMapId == null ? null : siteMapId.trim();
    }

    public String getSiteAttribute() {
        return siteAttribute;
    }

    public void setSiteAttribute(String siteAttribute) {
        this.siteAttribute = siteAttribute == null ? null : siteAttribute.trim();
    }

    public Date getSiteDate() {
        return siteDate;
    }

    public void setSiteDate(Date siteDate) {
        this.siteDate = siteDate;
    }
}