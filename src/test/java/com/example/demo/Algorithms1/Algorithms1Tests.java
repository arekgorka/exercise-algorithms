package com.example.demo.Algorithms1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Algorithms1Tests {

    @Test
    public void solution1tests() {
        assertEquals(23, new Algorithms1().solution1(10));
        assertEquals(543, new Algorithms1().solution1(50));
        assertEquals(1133, new Algorithms1().solution1(70));
    }

    @Test
    public void findOddTests() {
        assertEquals(5, new Algorithms1().findOdd(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        assertEquals(-1, new Algorithms1().findOdd(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        assertEquals(5, new Algorithms1().findOdd(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        assertEquals(10, new Algorithms1().findOdd(new int[]{10}));
        assertEquals(10, new Algorithms1().findOdd(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        assertEquals(1, new Algorithms1().findOdd(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }
}
