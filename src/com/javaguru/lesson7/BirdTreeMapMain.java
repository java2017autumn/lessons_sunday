package com.javaguru.lesson7;

import java.util.Map;
import java.util.TreeMap;

public class BirdTreeMapMain {

    public static void main(String[] args) {
        Bird firstBird = new Bird(10, "Kesha");

        Map<Bird, String> birdMap = new TreeMap<>();
        birdMap.put(firstBird, "Flying");
        birdMap.put(new Bird(3, "Pinguin"), "Not Flying Bird :(");
        birdMap.put(new Bird(13, "Eagle"), "Flying");
        birdMap.put(new Bird(23, "Sparrow"), "Flying");
        birdMap.put(new Bird(12, "Ostrich"), "Not flying");
        birdMap.put(new Bird(1, "Hawk"), "Flying");
        birdMap.put(new Bird(5, "Parrot"), "Flying");
        birdMap.put(new Bird(7, "Chicken"), "Not Flying");
        birdMap.put(new Bird(47, "Bluebird"), "Flying");

        birdMap.entrySet()
                .forEach(System.out::println);

        System.out.println();

        birdMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals("Flying"))
                .sorted(Map.Entry.comparingByKey(new BirdComparator()))
                .map(entry -> entry.getKey().getName())
                .forEach(System.out::println);
    }
}
