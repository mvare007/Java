package com.varela;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        long average = 0L;
        int sum = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                average = Math.round((double) sum / (double) count);
            } else {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }

        scanner.close();
    }
}
