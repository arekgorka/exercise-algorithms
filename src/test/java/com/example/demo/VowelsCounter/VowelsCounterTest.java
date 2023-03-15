package com.example.demo.VowelsCounter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelsCounterTest {

    @Test
    public void vowelsCounterTests() {
        assertEquals(6, new VowelsCounter().getCountWithIterator("WARTOSCI DOUBLE"));
        assertEquals(6, new VowelsCounter().getCountWithFor("WARTOSCI DOUBLE"));
    }
}
