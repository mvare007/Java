package com.varela;

public class Car extends Vehicle {

    protected String color;
    public boolean isSteeringRight;
    public boolean isSteeringLeft;
    public int gear;
    public boolean isAccelerating;
    public boolean isBraking;

    public Car(String brand, String model, int speed, String color, boolean isSteeringRight, boolean isSteeringLeft) {

        super("Car", brand, model, speed);
        this.color = color;
        this.isSteeringRight = isSteeringRight;
        this.isSteeringLeft = isSteeringLeft;
        this.gear = 0;
        this.isAccelerating = false;
        this.isBraking = false;
    }

    public String getColor() {
        return color;
    }

    public boolean isSteeringRight() {
        return isSteeringRight;
    }

    public boolean isSteeringLeft() {
        return isSteeringLeft;
    }

    public int getGear() {
        return gear;
    }

    public boolean isAccelerating() {
        return isAccelerating;
    }

    public boolean isBraking() {
        return isBraking;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void steerRight() {
        isSteeringRight = true;
    }

    public void steerLeft() {
        isSteeringLeft = true;
    }

    public void gearUp() {
        this.gear++;
    }

    public void gearDown() {
        if(this.gear > 0) {
            this.gear--;
        }  else {
            System.out.println("Gear is already 0. Maybe you meant to use reverse");
        }
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
        System.out.println("accelerating");
    }

    public void brake() {
        isBraking = true;
    }

    public void move() {
        if (this.isAccelerating) {
            setSpeed(this.speed);
        }
    }
}
