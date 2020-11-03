package com.varela;

public class F1Car extends Car {

    private int lift;
    private int thrust;
    private int drag;
    private int weight;

    public F1Car(String brand, String model, int speed, String color, boolean isSteeringRight,
                 boolean isSteeringLeft, int lift,
                 int thrust, int drag, int weight) {

        super(brand, model, speed, color, isSteeringRight, isSteeringLeft);
        this.lift = lift;
        this.thrust = thrust;
        this.drag = drag;
        this.weight = weight;
    }

    public int getLift() {
        return lift;
    }

    public int getThrust() {
        return thrust;
    }

    public int getDrag() {
        return drag;
    }

    public int getWeight() {
        return weight;
    }

    public void setLift(int lift) {
        this.lift = lift;
    }

    public void setThrust(int thrust) {
        this.thrust = thrust;
    }

    public void setDrag(int drag) {
        this.drag = drag;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void fireTurbo() {
        this.drag++;
        this.lift++;
        this.thrust++;
    }
}
