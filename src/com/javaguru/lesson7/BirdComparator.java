package com.javaguru.lesson7;

import java.util.Comparator;

public class BirdComparator implements Comparator<Bird> {
    @Override
    public int compare(Bird o1, Bird o2) {
        return o2.getWeight() - o1.getWeight();
    }
}
