package com.varela;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        int greatestCommonDivisor = 666;
        if (first < 10 || second < 10) {
            return -1;
        }

        int biggestNumber = 0;
        int smallestNumber = 0;
        if (first > second) {
            biggestNumber = first;
            smallestNumber = second;
        } else {
            biggestNumber = second;
            smallestNumber = first;
        }

        for (int i = biggestNumber; i != 1; i--) {
            if (biggestNumber % i == 0 && smallestNumber % i == 0) {
                greatestCommonDivisor = i;
                break;
            }
        }

        System.out.println("Greatest common divisor = " + greatestCommonDivisor);
        return greatestCommonDivisor;
    }
}

