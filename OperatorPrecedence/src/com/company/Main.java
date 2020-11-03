package com.company;

public class Main {

    public static void main(String[] args) {

        double firstValue = 20.00d;
        double secondValue = 80.00d;

        double result = (firstValue + secondValue) * 100.00d;
        System.out.println("Result is " + result);

        double remainder = result % 40.00d;
        System.out.println("Remainder is: " + remainder);

        boolean isRemainderZero = (remainder == 0) ? true : false;
        System.out.println("isRemainderZero? " + isRemainderZero);

        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        }
    }
}
