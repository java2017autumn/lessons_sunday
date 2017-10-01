package com.javaguru.lesson2;

import java.util.Scanner;

public class AIfEqualsZero {

    public static final int ZERO = 0;

    public static void main(String[] args) {
        printGreetings();
        int userInput = getNumberFromUser();
        boolean isNumberEqualsZero = isNumberEqualsZero(userInput);
        printResult(isNumberEqualsZero);

        String result = isNumberEqualsZero == true ? "ZERO" : "NOT ZERO";
        printResult(result);
    }

    public static void printGreetings() {
        System.out.println("Hello, enter integer number: ");
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static boolean isNumberEqualsZero(int number){
//        if ( number == ZERO) {
//            return true;
//        } else {
//            return false;
//        }
        return number == ZERO;
    }

    public static void printResult(boolean isZero) {
        if (isZero) {
            System.out.println("ZERO");
        } else {
            System.out.println("NOT ZERO");
        }
    }

    public static void printResult(String result) {
        System.out.println(result);
    }
}
