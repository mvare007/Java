package com.varela;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("Zero");
        }

        int reversedNumber = reverse(number);
            while (reversedNumber > 0) {
                int digit = reversedNumber % 10; // Extract least significant digit
                reversedNumber /= 10; // Discard least significant digit
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Number, please select between 0-9!");
                        break;
                }
            }

        if (getDigitCount(number) != getDigitCount(reverse(number))) {
            int difference = getDigitCount(number) - getDigitCount(reverse(number));
            for(int i = 0; i != difference; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; // Extract least significant digit
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10; // Discard least significant digit
        }

        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        int count = 0;

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number /= 10; // Discard least significant digit
                count ++;
            }
        }
        return count;
    }
}
