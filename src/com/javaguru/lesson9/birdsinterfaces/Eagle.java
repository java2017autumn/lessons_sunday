package com.javaguru.lesson9.birdsinterfaces;

/**
 * Created by javastar on 11/19/2017.
 */
public class Eagle implements Flyable, Eatable {

    @Override
    public void fly() {
        System.out.println("Flying high");
    }

    @Override
    public void eat() {
        System.out.println("Try to catch me");
    }
}
