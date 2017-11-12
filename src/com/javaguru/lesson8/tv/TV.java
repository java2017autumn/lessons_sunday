package com.javaguru.lesson8.tv;

public class TV {

    public static final int MAX_CHANNEL = 100;
    public static final int MIN_CHANNEL = 1;
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;

    private boolean turnedOn;
    private int channel = MIN_CHANNEL;
    private int volume = MIN_VOLUME;

    public void incrementChannel() {
        if (turnedOn) {
            if (channel == MAX_CHANNEL) {
                channel = MIN_CHANNEL;
            } else {
                channel++;
            }
            System.out.println("Current channel: " + channel);
        }
    }

    public void decrementChannel() {
        if (turnedOn) {
            if (channel == MIN_CHANNEL) {
                channel = MAX_CHANNEL;
            } else {
                channel--;
            }
            System.out.println("Current channel: " + channel);
        }
    }

    public void changeState() {
        if (turnedOn) {
            turnedOn = false;
        } else {
            turnedOn = true;
        }
    }

    public void increaseVolume() {
        if (turnedOn) {
            if (volume == MAX_VOLUME) {
                System.out.println("Reached MAX volume");
            } else {
                volume++;
            }
            System.out.println("Current volume: " + volume);
        }
    }

    public void decreaseVolume() {
        if (turnedOn) {
            if (volume == MIN_VOLUME) {
                System.out.println("Sound off");
            } else {
                volume --;
            }
            System.out.println("Current volume: " + volume);
        }
    }
}
