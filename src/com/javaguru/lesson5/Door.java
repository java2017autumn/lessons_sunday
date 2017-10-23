package com.javaguru.lesson5;

public class Door {

    String material;
    String color;
    Lock lock;

    public Door(String material, String color, Lock lock) {
        this.material = material;
        this.color = color;
        this.lock = lock;
    }

    public boolean isOpened() {
        return getLock().isUnlocked();
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

    public void open(String code) {
        getLock().unlock(code);
    }
}
