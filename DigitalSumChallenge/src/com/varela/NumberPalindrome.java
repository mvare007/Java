package com.varela;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10; // extract last digit
            System.out.println("Digit = " + lastDigit);
            reverse = reverse * 10; // increase place value by 1
            reverse += lastDigit;
            System.out.println("Reverse = " + reverse);
            number /= 10; // remove the last digit from number
            System.out.println("Number = " + number);
        }
        if (reverse == originalNumber) {
            return true;
        } else {
            return false;
        }
    }
}
