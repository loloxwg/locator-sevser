package com.nit.guhun.entity;

import java.util.Date;

public class MapEntity {
    private Integer mapId;

    private String mapName;

    private String mapUrl;

    private Integer mapX;

    private Integer mapY;

    private Date mapDate;

    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName == null ? null : mapName.trim();
    }

    public String getMapUrl() {
        return mapUrl;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl == null ? null : mapUrl.trim();
    }

    public Integer getMapX() {
        return mapX;
    }

    public void setMapX(Integer mapX) {
        this.mapX = mapX;
    }

    public Integer getMapY() {
        return mapY;
    }

    public void setMapY(Integer mapY) {
        this.mapY = mapY;
    }

    public Date getMapDate() {
        return mapDate;
    }

    public void setMapDate(Date mapDate) {
        this.mapDate = mapDate;
    }
}