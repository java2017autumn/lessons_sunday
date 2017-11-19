package com.javaguru.lesson9.birds;

public class Chicken extends Bird{
    @Override
    protected void fly() {
        System.out.println("I can't fly");
    }
}
