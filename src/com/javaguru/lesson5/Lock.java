package com.javaguru.lesson5;

public class Lock {

    boolean unlocked;
    String code = "0000";
    boolean blocked;

    public boolean isUnlocked() {
        return unlocked;
    }

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isCorrectCode(String code) {
        return this.code.equals(code);
    }

    public void unlock(String code) {
        if (isCorrectCode(code)) {
            setUnlocked(true);
            System.out.println("Successfully unlocked!");
        } else {
            System.out.println("Failed to unlock!");
        }
    }

}
