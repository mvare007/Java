package com.varela;

import java.awt.*;

public class Room {
    private String name;
    private Floor floor;
    private Door door;
    private Fireplace fireplace;

    public Room(String name, Floor floor, Door door, Fireplace fireplace) {
        this.name = name;
        this.floor = floor;
        this.door = door;
        this.fireplace = fireplace;
    }

    public String getName() {
        return name;
    }

    public Floor getFloor() {
        return floor;
    }

    public Door getDoor() {
        return door;
    }

    public Fireplace getFireplace() {
        return fireplace;
    }
}
