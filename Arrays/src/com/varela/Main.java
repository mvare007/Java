package com.varela;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] integers = getIntegers(4);

        System.out.println("Unsorted:");
        printIntegers(integers);

        System.out.println("Sorted:");
        printIntegers(sortIntegers(integers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printIntegers(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", typed value was " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int temp = 0;

        for(int i = 0; i < array.length; i++) {
            for(int n = i + 1; n < array.length; n++) {
                if(array[i] < array[n]) {
                    temp = array[i];
                    array[i] = array[n];
                    array[n] = temp;
                }
            }
        }

        return array;
    }
}
