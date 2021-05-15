/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ceptransportsys;

/**
 *
 * @author bisht
 */
public class TrafficEvent extends MonitoringTrafficEvent {
    private int vehicleCount;
    
    public TrafficEvent(int extID, int vehicleCount) {
        super(extID);

        this.vehicleCount = vehicleCount;
    }

    public int getTraffic() {
        return vehicleCount;
    }

    public void setTraffic(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }



    @Override
    public int hashCode() {
        return 41 * super.hashCode() + Double.hashCode(vehicleCount);
    }


}

