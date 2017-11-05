package com.javaguru.lesson7;

public class HumanMain {

    public static void main(String[] args) {
        Human firstHuman = new Human("Vasya", 20);
        System.out.println(firstHuman);

        Human secondHuman = new Human("Petya", 13);
        System.out.println(secondHuman);
        System.out.println(firstHuman);
    }
}
