package com.example.vehicleinfoservice;

public class Vehicle {

    private String Vin;
    private int chargeLevel;

    public Vehicle(){

    }
    public Vehicle(String vin, int chargeLevel) {
        Vin = vin;
        this.chargeLevel = chargeLevel;
    }

    public String getVin() {
        return Vin;
    }

    public Vehicle setVin(String vin) {
        Vin = vin;
        return this;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public Vehicle setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
        return this;
    }
}
