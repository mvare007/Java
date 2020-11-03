package com.varela;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        int lastDigit = number % 10;
        sum = firstDigit + lastDigit;
        System.out.println("Sum = " + sum);
        return sum;
    }
}
