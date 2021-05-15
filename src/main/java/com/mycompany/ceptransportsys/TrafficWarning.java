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
public class TrafficWarning {
 private int extID;
    private double averageTraffic;

    public TrafficWarning(int extID, double averageTraffic) {
        this.extID = extID;
        this.averageTraffic = averageTraffic;
    }

    public TrafficWarning() {
        this(-1, -1);
    }

    public int getextID() {
        return extID;
    }

    public void setRackID(int extID) {
        this.extID = extID;
    }

    public double getAverageTraffic() {
        return averageTraffic;
    }

    public void setAverageTraffic(double averageTraffic) {
        this.averageTraffic = averageTraffic;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TrafficWarning) {
            TrafficWarning other = (TrafficWarning) obj;

            return extID == other.extID && averageTraffic == other.averageTraffic;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 41 * extID + Double.hashCode(averageTraffic);
    }

    @Override
    public String toString() {
        return "TrafficWarning(" + getextID() + ", " + averageTraffic + ")";
    }
}
