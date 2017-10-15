package com.javaguru.lesson4;

public class ArrayUtils {

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] createIntegerArray(int length) {
        return new int[length];
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = NumberUtils.getRandomNumber();
        }
    }

}
