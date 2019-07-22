package com.crud.cruddevicegateway.dao.entity;

public class Device {
    private int uid;
    private String vendor;
    private String creationDate;
    private int status;

    public Device(int uid, String vendor, String creationDate, int status) {
        this.uid = uid;
        this.vendor = vendor;
        this.creationDate = creationDate;
        this.status = status;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}


