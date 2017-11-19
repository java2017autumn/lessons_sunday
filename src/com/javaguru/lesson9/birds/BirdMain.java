package com.javaguru.lesson9.birds;

import java.util.ArrayList;
import java.util.List;

public class BirdMain {

    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Penguin());
        birds.add(new Chicken());
        birds.add(new BlueBird());
        birds.add(new Bird() {
            @Override
            protected void fly() {
                System.out.println("Something...");
            }
        });

        birds.forEach(Bird::fly);

        birds.forEach(Bird::eat);
    }
}
