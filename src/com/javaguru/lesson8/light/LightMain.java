package com.javaguru.lesson8.light;

public class LightMain {

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        Switcher switcher = new Switcher();

        switcher.connect(lightBulb);

        switcher.changeState();
        switcher.changeState();
        switcher.changeState();
        switcher.changeState();
        switcher.changeState();
        switcher.changeState();
        switcher.changeState();
        switcher.changeState();
        switcher.changeState();
        switcher.changeState();
        switcher.changeState();
        switcher.changeState();
    }
}
