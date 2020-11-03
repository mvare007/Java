package com.varela;

public class Main {

    public static void main(String[] args) {
        DiagonalStar.printSquareStar(7);
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            while (number > 0) {
                int digit = number % 10; // Extract least significant digit
                System.out.println("Extracted Digit = " + digit);
                sum += digit; // add digit to sum
                number /= 10; // Discard least significant digit
                System.out.println("Discarded Digit = " + number);
                System.out.println("Sum = " + sum);
            }
        } else {
            sum = -1;
        }

        System.out.println("Final sum is = " + sum);
        return sum;
    }
}
