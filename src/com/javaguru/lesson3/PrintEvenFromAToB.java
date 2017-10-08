package com.javaguru.lesson3;

import java.util.Scanner;

public class PrintEvenFromAToB {

    public static void main(String[] args) {
        System.out.println("Hello, please enter first number: ");
        int firstNumber = getNumberFromUser();
        System.out.println("Please enter second number: ");
        int secondNumber = getNumberFromUser();

        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
//        while (firstNumber <= secondNumber) {
//            if(firstNumber % 2 == 0) {
//                System.out.println(firstNumber);
//            }
//            firstNumber++;
//        }
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
