package com.varela;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for(int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
                System.out.println("Adding... " + i);
            }
        }
        boolean isPerfect = sum == number ? true : false;
        System.out.println("Is perfect? " + isPerfect);
        return isPerfect;
    }
}
