package com.javaguru.lesson2;


import java.util.Scanner;

public class ConsoleInput {

    public static void main(String[] args) {
        printGreetings();
        int userInput = getNumberFromUser();
        int squareResult = square(userInput);
        printResult(squareResult);

    }

    public static void printGreetings() {
        System.out.println("Hello, enter integer number: ");
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static int square(int number) {
//        int squareResult = number * number;
//        return squareResult;
        return number * number;
    }

    public static void printResult(int result) {
        System.out.println("Result: " + result);
    }
}
