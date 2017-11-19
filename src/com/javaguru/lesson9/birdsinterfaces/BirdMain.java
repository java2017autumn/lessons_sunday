package com.javaguru.lesson9.birdsinterfaces;

public class BirdMain {

    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        flying(eagle);

        Chicken chicken = new Chicken();
        eating(eagle);
        eating(chicken);

        Flyable flyable = new Owl();
        flyable.fly();
    }

    public static void flying(Flyable flyable) {
        flyable.fly();
    }

    public static void eating(Eatable eatable) {
        eatable.eat();
    }
}
