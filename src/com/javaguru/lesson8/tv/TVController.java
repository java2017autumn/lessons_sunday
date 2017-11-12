package com.javaguru.lesson8.tv;

public class TVController {

    private TV tv;

    public void connect(TV tv) {
        this.tv = tv;
    }

    public void onOffButton() {
        tv.changeState();
    }

    public void nextChannel(){
        tv.incrementChannel();
    }

    public void prevChannel() {
        tv.decrementChannel();
    }

    public void increaseVolume() {
        tv.increaseVolume();
    }

    public void decreaseVolume() {
        tv.decreaseVolume();
    }
}
