package com.javaguru.lesson3;


import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        System.out.println("Hello, please enter number: ");
        int userInput = getNumberFromUser();

        if (isEven(userInput)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        String result = isEven(userInput) ? "Even" : "Odd";
        System.out.println(result);
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
