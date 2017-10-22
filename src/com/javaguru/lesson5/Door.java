package com.javaguru.lesson5;

public class Door {

    boolean isOpen;
    String material;
    String color;
    Lock lock;

    public boolean isOpen() {
        return lock.isOpen();
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }
}
