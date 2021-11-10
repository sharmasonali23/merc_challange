package com.example.vehicleinfoservice;

public class ChargingStation {

    private  String stationName;
    private int distance;
    private int chargingLevel;

    public ChargingStation(){

    }

    public ChargingStation(String stationName, int distance, int chargingLevel) {
        this.stationName = stationName;
        this.distance = distance;
        this.chargingLevel = chargingLevel;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getChargingLevel() {
        return chargingLevel;
    }

    public void setChargingLevel(int chargingLevel) {
        this.chargingLevel = chargingLevel;
    }
}
