package com.javaguru.lesson3;

import java.util.Scanner;

public class Pow {

    public static void main(String[] args) {
        System.out.println("Hello, please enter number: ");
        int number = getNumberFromUser();

        System.out.println("Please enter power: ");
        int power = getNumberFromUser();

        int powResult = pow(number, power);

        System.out.println(powResult);
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int pow(int number, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result = number * result;
        }
        return result;
    }
}
