package com.example.demo.MissingLetter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingLetterTest {

    @Test
    public void missingLetterTest() {
        assertEquals('e', new  MissingLetter().missingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', new  MissingLetter().missingLetter(new char[] { 'O','Q','R','S' }));
    }
}
