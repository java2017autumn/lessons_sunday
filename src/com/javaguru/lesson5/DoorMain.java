package com.javaguru.lesson5;

public class DoorMain {

    public static void main(String[] args) {
        Door door = new Door();
        door.setColor("BLACK");
        door.setMaterial("Wood");

        Lock lock = new Lock();
        door.setLock(lock);

        System.out.println("isOpen: " + door.isOpen());

    }
}
