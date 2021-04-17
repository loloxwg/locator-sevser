package com.nit.guhun.entity;

public class SignalEntity {
    private int signalId;
    private int signalWifiId;
    private String signalName;
    private String signalMac;
    private int signalPower;

    @Override
    public String toString() {
        return "SignalEntity{" +
                "signalId=" + signalId +
                ", signalWifiId=" + signalWifiId +
                ", signalName='" + signalName + '\'' +
                ", signalMac='" + signalMac + '\'' +
                ", signalPower=" + signalPower +
                '}';
    }

    public int getSignalId() {
        return signalId;
    }

    public void setSignalId(int signalId) {
        this.signalId = signalId;
    }

    public int getSignalWifiId() {
        return signalWifiId;
    }

    public void setSignalWifiId(int signalWifiId) {
        this.signalWifiId = signalWifiId;
    }

    public String getSignalName() {
        return signalName;
    }

    public void setSignalName(String signalName) {
        this.signalName = signalName;
    }

    public String getSignalMac() {
        return signalMac;
    }

    public void setSignalMac(String signalMac) {
        this.signalMac = signalMac;
    }

    public int getSignalPower() {
        return signalPower;
    }

    public void setSignalPower(int signalPower) {
        this.signalPower = signalPower;
    }
}
