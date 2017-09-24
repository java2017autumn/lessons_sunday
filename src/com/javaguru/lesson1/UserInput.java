package com.javaguru.lesson1;

import java.util.Scanner;

public class UserInput {

    public static void main(String args[]) {
        System.out.println("Hello, please enter integer number:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println(userInput);
    }
}
