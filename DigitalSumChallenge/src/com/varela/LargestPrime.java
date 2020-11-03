package com.varela;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int i;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                number /=i;
                i--;
                System.out.println(i);

            }
        }
        return i;
    }
}
