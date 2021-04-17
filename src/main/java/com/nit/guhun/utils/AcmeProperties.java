package com.nit.guhun.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("acme")
public final class AcmeProperties {
    private String mapUrl;
    private String Bucket;
    private String Region;
    private String AppID;
    private String SecretId;
    private String SecretKey;
    private String baseKey;

    public String getBaseKey() {
        return baseKey;
    }

    public void setBaseKey(String baseKey) {
        this.baseKey = baseKey;
    }

    public String getMapUrl() {
        return mapUrl;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }

    public String getBucket() {
        return Bucket;
    }

    public void setBucket(String bucket) {
        Bucket = bucket;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getAppID() {
        return AppID;
    }

    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    public String getSecretId() {
        return SecretId;
    }

    public void setSecretId(String secretId) {
        SecretId = secretId;
    }

    public String getSecretKey() {
        return SecretKey;
    }

    public void setSecretKey(String secretKey) {
        SecretKey = secretKey;
    }
}
