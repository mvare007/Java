package com.varela;

public class Door {
    private String material;
    private double height;
    private double width;

    public Door(String material, double height, double width) {
        this.material = material;
        this.height = height;
        this.width = width;
    }

    public String getMaterial() {
        return material;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    private void setMaterial(String material) {
        this.material = material;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    public void changeDoor(String material, double height, double width) {
        setMaterial(material);
        setHeight(height);
        setWidth(width);
    }
}
