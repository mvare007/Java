package com.varela;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void minMaxInput() {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;

         while (true) {
             System.out.println("Enter number:");
             int number = scanner.nextInt();
             boolean isInt = scanner.hasNextInt();
             min = (min == 0) ? number : Math.min(number, min);
             max = Math.max(number, max);

             if (!isInt) {
                 System.out.println("Min = " + min);
                 System.out.println("Max = " + max);
                 break;
             }

             scanner.nextLine();
         }

         scanner.close();
    }
}
