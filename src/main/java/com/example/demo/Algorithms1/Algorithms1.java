package com.example.demo.Algorithms1;

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
}
