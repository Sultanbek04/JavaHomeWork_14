package com.google.lesson_14;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100_000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(69420);
        }

        FindMax max = new FindMax();
        FindMin min = new FindMin();
        max.setArr(arr);
        min.setArr(arr);

        Thread thread1 = new Thread(max);
        thread1.run();
        Thread thread2 = new Thread(min);
        thread2.run();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Max number: " + max.getMax());
        System.out.println("Min number: " + min.getMin());


    }
}
