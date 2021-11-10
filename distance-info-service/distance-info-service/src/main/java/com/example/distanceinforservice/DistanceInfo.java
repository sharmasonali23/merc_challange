package com.example.distanceinforservice;

import java.util.List;

public class DistanceInfo {

    private  String source;
    private  String destination;
    private  int distance;
    private List<ChargingStation> chargingStationList;
    public  DistanceInfo(){

    }

    public DistanceInfo(String source, String destination, int distance, List<ChargingStation> chargingStationList) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.chargingStationList = chargingStationList;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public List<ChargingStation> getChargingStationList() {
        return chargingStationList;
    }

    public void setChargingStationList(List<ChargingStation> chargingStationList) {
        this.chargingStationList = chargingStationList;
    }
}
