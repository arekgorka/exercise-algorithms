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
}
