package com.google.lesson_14;

import java.util.Arrays;

public class FindMin implements Runnable {
    private int[] arr;
    private int min;

    public int getMin() {
        return min;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        min = Arrays.stream(arr).min().getAsInt();
    }
}
