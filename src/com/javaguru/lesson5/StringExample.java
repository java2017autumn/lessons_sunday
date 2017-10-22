package com.javaguru.lesson5;

public class StringExample {

    public static void main(String[] args) {
        String helloWorld = "Hello World!";
        String[] words = helloWorld.split(" ");
        for(String word : words) {
            System.out.println(word);
        }
        char[] chars = helloWorld.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
