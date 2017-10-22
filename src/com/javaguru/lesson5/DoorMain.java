package com.javaguru.lesson5;

public class DoorMain {

    public static void main(String[] args) {
        Lock lock = new Lock();
        Door door = new Door(false, "Wood", "Black", lock);

        System.out.println("isOpen: " + door.isOpen());

        String firstInput = "124125aw";
        String secondInput = "0000";

        System.out.println("First input result: " + door.getLock().isCorrectCode(firstInput));
        System.out.println("Second input result: " + door.getLock().isCorrectCode(secondInput));
        if (door.getLock().isCorrectCode(secondInput)) {
            door.getLock().open();
        }

        System.out.println("Open: " + door.isOpen());
    }
}
