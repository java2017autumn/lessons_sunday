package com.javaguru.lesson6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> wordsWithCounter = new HashMap<>();

        while (true) {
            String userInput = getStringFromUser();

            if (userInput.equals("")) {
                break;
            }
            if (wordsWithCounter.containsKey(userInput)) {
                int counter = wordsWithCounter.get(userInput);
                counter = counter + 1;
                wordsWithCounter.put(userInput, counter);
            } else {
                wordsWithCounter.put(userInput, 1);
            }
        }

        for (String string : wordsWithCounter.keySet()) {
            String txt = string;
            txt = txt + " " + wordsWithCounter.get(string);
            System.out.println(txt);
        }
    }

    public static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
