package com.google.lesson_14;

import java.util.Arrays;

public class FindMax implements Runnable {
    private int[] arr;
    private int max;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getMax() {
        return max;
    }

    @Override
    public void run() {
        max = Arrays.stream(arr).max().getAsInt();
    }
}
