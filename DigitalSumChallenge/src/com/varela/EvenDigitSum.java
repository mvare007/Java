package com.varela;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10; // Extract least significant digit
            System.out.println("Extracted Digit = " + digit);
            if (digit % 2 == 0) {
                sum += digit; // add digit to sum
            }
            number /= 10; // Discard least significant digit
            System.out.println("Discarded Digit = " + number);
            System.out.println("Sum = " + sum);
        }
        return sum;
    }
}
