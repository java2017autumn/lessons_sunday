package com.javaguru.lesson12;

class PairMain {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();
        pair.setLeft("age");
        pair.setRight(12);

        System.out.println(pair);
    }
}
