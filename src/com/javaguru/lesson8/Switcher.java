package com.javaguru.lesson8;

public class Switcher {

    private LightBulb lightBulb;
    private boolean turnedOn;

    public void connect(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void changeState() {
        if (turnedOn) {
            lightBulb.turnOff();
            turnedOn = false;
        } else {
            lightBulb.turnOn();
            turnedOn = true;
        }
    }
}
