package com.javaguru.lesson4;

public class ArrayUtilsUsage {

    public static void main(String[] args) {
        int length = NumberUtils.getNumberFromUser();
        int[] array = ArrayUtils.createIntegerArray(length);
        ArrayUtils.fillArrayWithRandomNumbers(array);
        ArrayUtils.printArray(array);
    }
}
