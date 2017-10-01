package com.javaguru.lesson2;

import java.util.Scanner;

public class IfAndOr {

    public static void main(String[] args) {
        printGreetings();
        int userInput = getNumberFromUser();

        if ( userInput == 0 || userInput > 0) {
            System.out.println("Equals Zero Or Positive!");
        }

        if (userInput < 0 && userInput == -13) {
            System.out.println("Less than zero and -13");
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
