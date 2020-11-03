package com.varela;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        findMin(readIntegers(5));
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Type " + count + " numbers:\r");
        for(int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < minValue) {
                minValue = array[i];
            }
        }

        System.out.println("Min value = " + minValue);
        return minValue;
    }
}
