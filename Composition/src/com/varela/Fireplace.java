package com.varela;

public class Fireplace {

    private boolean isBurning;
    private boolean hasWood;
    private boolean isClosed;

    public Fireplace() {
        this.isBurning = false;
        this.hasWood = false;
        this.isClosed = false;
    }

    public boolean isBurning() {
        return isBurning;
    }

    public boolean isHasWood() {
        return hasWood;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void putWood() {
        this.hasWood = true;
    }

    private void setClosed() {
        this.isClosed = !this.isClosed;
    }

    private void lightFire() {
        this.isBurning = true;
    }

    public void start() {
        if(isHasWood()) {
            lightFire();
            setClosed();
            System.out.println("The wood is burning get cozy!");
        } else {
            System.out.println("Please add wood to start a fire");
        }
    }
}
