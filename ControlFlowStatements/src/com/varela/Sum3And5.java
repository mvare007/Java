package com.varela;

public class Sum3And5 {
    public static void Sum() {

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " can be divided by both 3 and 5");
                count ++;
                sum += i;

                if (count == 5) {
                    break;
                }
            }
        }

        System.out.println("Sum of first 5 numbers divisible by both 3 and 5 is: " + sum);
    }

    public static boolean isOdd(int number) {
        if (number > 0 && number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > 0 && end > 0 && end >= start) {
            for(int i = start; i <= end; i++) {
                sum += isOdd(i) ? i : 0;
            }
            return sum;
        } else {
            return -1;
        }
    }
}
