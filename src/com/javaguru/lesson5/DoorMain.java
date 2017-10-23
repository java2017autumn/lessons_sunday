package com.javaguru.lesson5;

import java.util.Scanner;

public class DoorMain {

    public static void main(String[] args) {
        Lock combinationLock = new Lock();
        Door door = new Door("Wood", "Black", combinationLock);

        System.out.println("Door opened: " + door.isOpened());

        System.out.println("Please enter code: ");
        String userCode = getCodeFromUser();

        door.open(userCode);

        System.out.println("Door opened: " + door.isOpened());
    }

    public static String getCodeFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
