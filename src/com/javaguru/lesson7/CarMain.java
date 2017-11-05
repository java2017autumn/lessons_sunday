package com.javaguru.lesson7;

public class CarMain {

    public static void main(String[] args) {
        Car firstCar = new Car("Black", "BMW");
        System.out.println("First Car: " + firstCar);

        Car secondCar = new Car("Black", "BMW");
        System.out.println("Second car: " + secondCar);

        System.out.println("Equals: " + firstCar.equals(secondCar));
    }
}
