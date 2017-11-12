package com.javaguru.lesson8.tv;

public class TVMain {

    public static void main(String[] args) {
        TV tv = new TV();
        TVController controller = new TVController();
        controller.connect(tv);

        controller.onOffButton();
        controller.increaseVolume();
        controller.decreaseVolume();
        controller.decreaseVolume();
        controller.nextChannel();
        controller.prevChannel();

        controller.onOffButton();
        controller.onOffButton();

        controller.increaseVolume();
        controller.nextChannel();


    }
}
