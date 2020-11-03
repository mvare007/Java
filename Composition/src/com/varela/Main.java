package com.varela;

class Car {

    private String name;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        System.out.println("Car class startEngine() called");
    }

    public void accelerate() {
        System.out.println("Car class accelerate() called");
    }

    public void brake() {
        System.out.println("Car class brake() called");
    }
}

class Lamborghini extends Car {
    public Lamborghini(int numberOfCylinders) {
        super("Lamborghini", numberOfCylinders);
    }

    public void startEngine() {
        System.out.println("Lamborghini class startEngine() called");
    }

    public void accelerate() {
        System.out.println("Lamborghini class accelerate() called");
    }

    public void brake() {
        System.out.println("Lamborghini class brake() called");
    }
}

class Ferrari extends Car {
    public Ferrari(int numberOfCylinders) {
        super("Ferrari", numberOfCylinders);
    }

    public void startEngine() {
        System.out.println("Ferrari class startEngine() called");
    }

    public void accelerate() {
        System.out.println("Ferrari class accelerate() called");
    }

    public void brake() {
        System.out.println("Ferrari class brake() called");
    }
}

class Pagani extends Car {
    public Pagani(int numberOfCylinders) {
        super("Pagani", numberOfCylinders);
    }

    public void startEngine() {
        System.out.println("Pagani class startEngine() called");
    }

    public void accelerate() {
        System.out.println("Pagani class accelerate() called");
    }

    // No brake method
}


public class Main {

    public static void main(String[] args) {
//        Floor brownFloor = new Floor("Brown", 10, 10, 120);
//        Door woodDoor = new Door("Cherry Wood", 180, 100);
//        Fireplace stoneFireplace = new Fireplace();
//        Room livingRoom = new Room("Living Room", brownFloor, woodDoor, stoneFireplace);
//
//        livingRoom.getFireplace().putWood();
//        livingRoom.getFireplace().start();
//
//        System.out.println("Living room door height = " + livingRoom.getDoor().getHeight());
//        System.out.println("Living room door width = " + livingRoom.getDoor().getWidth());
//        System.out.println("Living room door material = " + livingRoom.getDoor().getMaterial());
//
//        livingRoom.getDoor().changeDoor("Hazel Wood", 200, 120 );
//
//        System.out.println("Living room door height = " + livingRoom.getDoor().getHeight());
//        System.out.println("Living room door width = " + livingRoom.getDoor().getWidth());
//        System.out.println("Living room door material = " + livingRoom.getDoor().getMaterial());
//
//        System.out.println("Floor single tile area is: " + livingRoom.getFloor().getSingleTileArea());
//
//        System.out.println(livingRoom.getDoor().getWidth());

//        Printer myPrinter = new Printer(-1, true);
//
//        myPrinter.fillToner();
//        myPrinter.printPage();

        Car car = new Car("Generic Car", 4);
        car.startEngine();
        car.accelerate();
        car.brake();

        Lamborghini lamborghini = new Lamborghini(12);
        lamborghini.startEngine();
        lamborghini.accelerate();
        lamborghini.brake();

        Ferrari ferrari = new Ferrari(8);
        ferrari.startEngine();
        ferrari.accelerate();
        ferrari.brake();

        Pagani pagani = new Pagani(6);
        pagani.startEngine();
        pagani.accelerate();
        pagani.brake();

    }
}
