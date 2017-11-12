package com.javaguru.lesson8;

public class Switcher {

    private LightBulb lightBulb;

    public void connect(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void turnOn() {
        lightBulb.turnOn();
    }

    public void turnOff() {
        lightBulb.turnOff();
    }
}
