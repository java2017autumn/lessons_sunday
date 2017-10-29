package com.javaguru.lesson6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        fillListWithRandomNumbers(list);
        long stop = System.currentTimeMillis();

        long result = stop - start;
        System.out.println("List size: " + list.size());
        System.out.println("ms: " + result);
    }

    public static void fillListWithRandomNumbers(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            int randomNumber = getRandomNumber();
            list.add(0, randomNumber);
        }
    }

    public static int getRandomNumber(){
        Random random = new Random();
        return random.nextInt();
    }
}
