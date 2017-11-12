package com.javaguru.lesson8;

public class LightBulb {

    private boolean turnedOn;
    private int availableTurnOnCount = 3;

    private boolean canBeTurnedOn() {
        return !turnedOn && availableTurnOnCount != 0;
    }

    public void turnOn() {
        if (canBeTurnedOn()) {
            turnedOn = true;
            availableTurnOnCount--;
            System.out.println("Light: on");
        } else if (turnedOn) {
            System.out.println("Already turned on");
        } else {
            System.out.println("Burned out :(");
        }
    }

    public void turnOff() {
        if (turnedOn) {
            turnedOn = false;
            System.out.println("Light: off");
        }
    }
}
