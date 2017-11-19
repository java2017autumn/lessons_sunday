package com.javaguru.lesson9.birds;

public class Penguin extends Bird {

    @Override
    protected void fly() {
        System.out.println("I can't fly but i can swim");
    }
}
