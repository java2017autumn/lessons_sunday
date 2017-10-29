package com.javaguru.lesson6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> uniqueWords = new HashSet<>();

        while (true) {
            String userInput = getStringFromUser();
            if (userInput.equals("")) {
                break;
            }
            uniqueWords.add(userInput);
        }

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    public static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
