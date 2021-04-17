package com.nit.guhun.entity;

public class UserSiteEntity {
    private String userId;
    private int wifiId;
    private int siteId;
    private int mapId;
    private String siteName;
    private String mapName;
    private int gridX;
    private int gridY;
    private String mapUrl;

    @Override
    public String toString() {
        return "UserSiteEntity{" +
                "userId='" + userId + '\'' +
                ", wifiId=" + wifiId +
                ", siteId=" + siteId +
                ", mapId=" + mapId +
                ", siteName='" + siteName + '\'' +
                ", mapName='" + mapName + '\'' +
                ", gridX=" + gridX +
                ", gridY=" + gridY +
                ", mapUrl='" + mapUrl + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getWifiId() {
        return wifiId;
    }

    public void setWifiId(int wifiId) {
        this.wifiId = wifiId;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public int getGridX() {
        return gridX;
    }

    public void setGridX(int gridX) {
        this.gridX = gridX;
    }

    public int getGridY() {
        return gridY;
    }

    public void setGridY(int gridY) {
        this.gridY = gridY;
    }

    public String getMapUrl() {
        return mapUrl;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }
}
