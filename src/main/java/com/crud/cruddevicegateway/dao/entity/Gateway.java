package com.crud.cruddevicegateway.dao.entity;

import java.util.List;

public class Gateway {
    private String id;
    private String name;
    private String address;
    private List<Device> devices;


    public Gateway(String id, String name, String address, List<Device> devices) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.devices = devices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}
