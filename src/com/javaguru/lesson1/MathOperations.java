package com.javaguru.lesson1;


import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = input.nextInt();

        int sumResult = firstNumber + secondNumber;
        int multiplyResult = firstNumber * secondNumber;
        double divideResult = firstNumber / secondNumber;
        int subtractResult = firstNumber - secondNumber;
        boolean isFirstNumberPositive = firstNumber > 0;
        boolean isSecondNumberZero = secondNumber == 0;

        System.out.println("Sum: " + sumResult);
        System.out.println("Multiply: " + multiplyResult);
        System.out.println("Divide: " + divideResult);
        System.out.println("Subtract: " + subtractResult);
        System.out.println("First number positive: " + isFirstNumberPositive);
        System.out.println("Second number zero: " + isSecondNumberZero);
    }
}
