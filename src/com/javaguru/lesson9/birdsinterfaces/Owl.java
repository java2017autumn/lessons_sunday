package com.javaguru.lesson9.birdsinterfaces;

/**
 * Created by javastar on 11/19/2017.
 */
public class Owl implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flying at night");
    }
}
