package com.boxing.unit;

public class Chooser {
    private int[] numbers;

    public int choose(int[] numbers) {
        int minimum=numbers[0];
        for (int index=1;index<numbers.length;index++) {
            if (minimum>numbers[index]) minimum=numbers[index];
        }
        return minimum;
    }
}
