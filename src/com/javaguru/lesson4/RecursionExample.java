package com.javaguru.lesson4;

public class RecursionExample {

    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);
    }

    public static int sum(int number) {
        if (number > 10000) {
            return number;
        }
        return sum(number + number);
    }
}
