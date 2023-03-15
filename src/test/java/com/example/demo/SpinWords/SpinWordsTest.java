package com.example.demo.SpinWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpinWordsTest {
    @Test
    public void test() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }
}
