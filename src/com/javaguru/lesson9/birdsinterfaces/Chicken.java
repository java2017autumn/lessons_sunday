package com.javaguru.lesson9.birdsinterfaces;

/**
 * Created by javastar on 11/19/2017.
 */
public class Chicken implements Eatable {
    @Override
    public void eat() {
        System.out.println("Mmm delicious!");
    }
}
