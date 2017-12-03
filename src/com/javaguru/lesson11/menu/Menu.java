package com.javaguru.lesson11.menu;

import java.util.Scanner;

class Menu {

    void sayHello() {
        System.out.println("Hello, choose one of actions");
    }

    void printMenu() {
        System.out.println("1. Start");
        System.out.println("2. Options");
        System.out.println("3. Exit");
    }

    private int getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int getActionFromUser() {
        while (true) {
            try {
                int choose = getUserNumber();
                checkUserInput(choose);
                return choose;
            } catch (RuntimeException e) {
                System.out.println("Incorrect user input");
                printMenu();
            }
        }
    }

    private void checkUserInput(int userInput) {
        if (userInput > 3 || userInput < 1) {
            throw new IncorrectInputException("Incorrect user input");
        }
    }

    void makeAction() {
        int action = getActionFromUser();

        switch (action) {
            case 1:
                System.out.println("Chosen start");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Wrong menu number");

        }
    }

}
