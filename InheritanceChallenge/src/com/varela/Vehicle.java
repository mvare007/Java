package com.varela;

public class Vehicle {

    private String type;
    private String brand;
    private String model;
    protected int speed;

    public Vehicle(String type, String brand, String model, int speed) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
