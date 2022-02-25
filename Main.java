package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numbers = new int[11];
        for(int i=0;i<numbers.length;i++) {
            numbers[i] = rnd.nextInt(20);
        }
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        for(int i=0;i<numbers.length;i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
