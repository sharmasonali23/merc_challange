package com.example.vehicleinfoservice;

import java.util.List;

public class VehicleInfo {

    private  String vin;
    private  String source;
    private  String destination;
    private int distance;
    private int currentChargingLevel;
    private boolean isChargingRequired;
    private List<ChargingStation> chargingStations;
    private Errors errors;

    public VehicleInfo(){

    }
    public VehicleInfo(String vin, String source, String destination, int distance, int currentChargingLevel, boolean isChargingRequired, List<ChargingStation> chargingStations, Errors errors) {
        this.vin = vin;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.currentChargingLevel = currentChargingLevel;
        this.isChargingRequired = isChargingRequired;
        this.chargingStations = chargingStations;
        this.errors = errors;
    }

    public String getVin() {
        return vin;
    }

    public VehicleInfo setVin(String vin) {
        this.vin = vin;
        return this;
    }

    public String getSource() {
        return source;
    }

    public VehicleInfo setSource(String source) {
        this.source = source;
        return this;
    }

    public String getDestination() {
        return destination;
    }

    public VehicleInfo setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public int getDistance() {
        return distance;
    }

    public VehicleInfo setDistance(int distance) {
        this.distance = distance;
        return this;
    }

    public int getCurrentChargingLevel() {
        return currentChargingLevel;
    }

    public VehicleInfo setCurrentChargingLevel(int currentChargingLevel) {
        this.currentChargingLevel = currentChargingLevel;
        return this;
    }

    public boolean isChargingRequired() {
        return isChargingRequired;
    }

    public VehicleInfo setChargingRequired(boolean chargingRequired) {
        isChargingRequired = chargingRequired;
        return this;
    }

    public List<ChargingStation> getChargingStations() {
        return chargingStations;
    }

    public VehicleInfo setChargingStations(List<ChargingStation> chargingStations) {
        this.chargingStations = chargingStations;
        return this;
    }

    public Errors getErrors() {
        return errors;
    }

    public VehicleInfo setErrors(Errors errors) {
        this.errors = errors;
        return this;
    }
}
