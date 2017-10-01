package com.javaguru.lesson2;


import java.util.Scanner;

public class IfElseIfElse {

    public static final int ZERO = 0;

    public static void main(String[] args) {
        printGreetings();
        int userInput = getNumberFromUser();

        if (userInput == ZERO) {
            System.out.println("ZERO!");
        } else if (userInput > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

    }

    public static void printGreetings() {
        System.out.println("Hello, enter integer number: ");
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }
}
