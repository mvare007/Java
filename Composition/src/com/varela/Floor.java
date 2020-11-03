package com.varela;

public class Floor {

    private String color;
    private double tileX;
    private double tileY;
    private int numberOfTiles;

    public Floor(String color, double tileX, double tileY, int numberOfTiles) {
        this.color = color;
        this.tileX = tileX;
        this.tileY = tileY;
        this.numberOfTiles = numberOfTiles;
    }

    public String getColor() {
        return color;
    }

    private double getTileX() {
        return tileX;
    }

    private double getTileY() {
        return tileY;
    }

    public double getSingleTileArea() {
        return (tileX * tileY);
    }

    public int getNumberOfTiles() {
        return numberOfTiles;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTileX(double tileX) {
        this.tileX = tileX;
    }

    public void setTileY(double tileY) {
        this.tileY = tileY;
    }

    public void setNumberOfTiles(int numberOfTiles) {
        this.numberOfTiles = numberOfTiles;
    }
}
