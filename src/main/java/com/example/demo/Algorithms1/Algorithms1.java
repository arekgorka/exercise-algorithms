package com.example.demo.Algorithms1;

import java.util.Arrays;

public class Algorithms1 {

    //obliczanie sumy z liczb podzielnych przez 3 i 5 mniejszej od podanej liczby
    public int solution1(int number) {
        int sum = 0;
        for (int i = 1; i<number; i++) {
            if (i%3==0 || i%5==0) {
                sum+=i;
            }
        }
        return sum;
    }

    //Given an array of integers, find the one that appears an odd number of times.
    //There will always be only one integer that appears an odd number of times.
    public int findOdd(int[] a) {
        int odd = 0;
        for (int e : a) {
            int count = 0;
            for (int i : a) {
                if (i == e) {count++;}
            }
            if (count == 1 || count % 2 == 1) {odd = e;}
        }
        return odd;
    }
}
