/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ceptransportsys;

import java.util.Objects;

/**
 *
 * @author bisht
 */
public abstract class MonitoringTrafficEvent {
    private int extID;
    private int vehicleCount;

    public MonitoringTrafficEvent(int extID) {
    }

    public int getExtID() {
        return extID;
    }

    public void setExtID(int extID) {
        this.extID = extID;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public MonitoringTrafficEvent(int extID, int vehicleCount) {
        this.extID = extID;
        this.vehicleCount = vehicleCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MonitoringTrafficEvent)) return false;
        MonitoringTrafficEvent that = (MonitoringTrafficEvent) o;
        return getExtID() == that.getExtID() &&
                getVehicleCount() == that.getVehicleCount();
    }

    @Override
    public String toString() {
        return "MonitoringTrafficEvent{" +
                "extID=" + extID +
                ", vehicleCount=" + vehicleCount +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExtID(), getVehicleCount());
    }

}

