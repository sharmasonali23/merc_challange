package com.example.vehicleinfoservice;

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

    public DistanceInfo setSource(String source) {
        this.source = source;
        return this;
    }

    public String getDestination() {
        return destination;
    }

    public DistanceInfo setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public int getDistance() {
        return distance;
    }

    public DistanceInfo setDistance(int distance) {
        this.distance = distance;
        return this;
    }

    public List<ChargingStation> getChargingStationList() {
        return chargingStationList;
    }

    public DistanceInfo setChargingStationList(List<ChargingStation> chargingStationList) {
        this.chargingStationList = chargingStationList;
        return this;
    }
}
