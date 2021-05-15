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
public class TrafficAlert {
    
 private int extID;

    public TrafficAlert(int extID) {
        this.extID = extID;
    }

    public TrafficAlert() {
        this(-1);
    }

    public void setextID(int extID) {
        this.extID = extID;
    }

    public int getextID() {
        return extID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TrafficAlert) {
            TrafficAlert other = (TrafficAlert) obj;
            return extID == other.extID;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return extID;
    }

    @Override
    public String toString() {
        return "TrafficAlert(" + getextID() + ")";
    }
}
