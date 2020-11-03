package com.varela;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(myArray);
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[index] = array[i];
            index++;
        }

        printArray(array);
        printArray(reversedArray);
    }
}
