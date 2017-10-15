package com.javaguru.lesson4;

import java.util.Random;
import java.util.Scanner;

public class NumberUtils {

    public static int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(1001);
    }

    public static int getRandomNumber(int bound){
        Random random = new Random();
        return random.nextInt(bound);
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
