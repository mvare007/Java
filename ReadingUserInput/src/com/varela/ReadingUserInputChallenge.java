package com.varela;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void readInput() {
        int count = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (count <= 10) {
            System.out.println("Enter number #" + count + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                System.out.println("Current Sum = " + sum);
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }

        scanner.close();
        System.out.println("Final Sum = " + sum);
    }
}
