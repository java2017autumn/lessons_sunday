package com.javaguru.lesson3;

import java.util.Scanner;

public class UserSecretKeyInput {

    public static void main(String[] args) {
        String secretKey = "secret";

        while (true) {
            System.out.println("Please enter secret key: ");
            String userInput = getSecretKeyFromUser();

            if (secretKey.equals(userInput)) {
                System.out.println("Success!");
                break;
            }
        }
    }

    public static String getSecretKeyFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
