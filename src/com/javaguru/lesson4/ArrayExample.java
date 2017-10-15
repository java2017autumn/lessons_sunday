package com.javaguru.lesson4;


import java.util.Random;

public class ArrayExample {

    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] array = createArray(SIZE);
        fillArrayWithRandomNumber(array);
        printArray(array);
    }

    public static int[] createArray(int length) {
        return new int[length];
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }

    public static void fillArrayWithRandomNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generateRandomNumber();
        }
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }

}
