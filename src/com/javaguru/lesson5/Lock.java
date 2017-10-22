package com.javaguru.lesson5;

public class Lock {

    boolean isOpen;
    String code = "0000";
    boolean isBlocked;

    public Lock() {

    }

    public Lock(String code) {
        this.code = code;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public boolean isCorrectCode(String code) {
        return this.code.equals(code);
    }

    public void open() {
        isOpen = true;
    }
}
