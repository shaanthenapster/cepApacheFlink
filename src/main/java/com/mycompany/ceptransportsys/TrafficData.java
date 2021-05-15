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
public class TrafficData {
    
    private String status;
   
    private  long avgMeasuredTime;
    private  long avgSpeed;
    private  String extID;
    private  long medianMeasuredTime;
    private  String TIMESTAMP;
    private  long vehicleCount;
    private  long _id;
    private  long REPORT_ID;
    public TrafficData(){}

    public TrafficData(
    String status,
    long avgMeasuredTime,
    long avgSpeed,
    String extID,
    long medianMeasuredTime,
    String TIMESTAMP,
    long vehicleCount,
    long _id,
    long REPORT_ID) {
        this.status = status;
        this.avgMeasuredTime = avgMeasuredTime;
        this.avgSpeed = avgSpeed;
        this.extID = extID;
        this.medianMeasuredTime = medianMeasuredTime;
        this.TIMESTAMP = TIMESTAMP;
        this.vehicleCount=vehicleCount;
        this._id=_id;
        this.REPORT_ID=REPORT_ID;
        
    }

    public void setavgstatus(String status) {
        this.status = status;
    }
    public void setavgMeasuredTime(long avgMeasuredTime) {
        this.avgMeasuredTime = avgMeasuredTime;
    }

    public void setavgSpeed(long avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public void setextID(String extID) {
        this.extID = extID;
    }

    public void setmedianMeasuredTime(long medianMeasuredTime) {
        this.medianMeasuredTime = medianMeasuredTime;
    }

    public void setTIMESTAMP(String TIMESTAMP) {
        this.TIMESTAMP = TIMESTAMP;
    }

    public void setvehicleCount(long vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public void set_id(long  _id) {
        this._id = _id;
    }
    
        public void setREPORT_ID(long REPORT_ID) {
        this.REPORT_ID = REPORT_ID;
    }

    public String getstatus() {
        return status;
    }
        public long avgMeasuredTime() {
        return avgMeasuredTime;
    }

    public long  getavgSpeed() {
        return avgSpeed;
    }

    public String getextID() {
        return extID;
    }

    public long getmedianMeasuredTime() {
        return medianMeasuredTime;
    }

    public String getTIMESTAMP() {
        return TIMESTAMP;
    }

    public long getvehicleCount() {
        return vehicleCount;
    }

    public long get_id() {
        return _id;
    }
     public long getREPORT_ID() {
        return REPORT_ID;
    }
}