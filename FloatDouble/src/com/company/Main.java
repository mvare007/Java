package com.company;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue  = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue  = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int intValue = 5 / 2;
        float floatValue = 5f / 3f;
        double doubleValue = 5d / 3d;
        System.out.println("Int Value = " + intValue);
        System.out.println("Float Value = " + floatValue);
        System.out.println("Double Value = " + doubleValue);

        double pounds = 1d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(pounds + " Pound is equal to: " +
                kilograms + " Kilograms");
    }
}
