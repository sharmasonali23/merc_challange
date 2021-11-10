package com.example.chargeinfoservice;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {

    @Id
    private  String transactionId;
    private String Vin;
    private int chargeLevel;

    public Vehicle(){

    }

    public Vehicle(String transactionId, String vin, int chargeLevel) {
        this.transactionId = transactionId;
        Vin = vin;
        this.chargeLevel = chargeLevel;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Vehicle setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
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
