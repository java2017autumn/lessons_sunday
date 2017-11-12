package com.javaguru.lesson8;

public class LightMain {

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        Switcher switcher = new Switcher();

        switcher.connect(lightBulb);

        switcher.turnOn();
        switcher.turnOn();
        switcher.turnOn();
        switcher.turnOn();
        switcher.turnOff();

        switcher.turnOn();
        switcher.turnOff();

        switcher.turnOn();
        switcher.turnOff();

        switcher.turnOn();
        switcher.turnOn();
        switcher.turnOn();
    }
}
