package com.javaguru.lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        while (true) {
            String userInput = getStringFromUser();
            if (userInput.equals("")) {
                break;
            }
            strings.add(userInput);
        }

        for (String string : strings) {
            System.out.println(string);
        }

    }


    public static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
