package com.example.demo.CreditCounter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCounterTest {

    @Test
    public void creditCounterTests() {
        //Given
        CreditCounter cC = new CreditCounter(150000,3,1.1);
        //When & Then
        assertEquals(180000.0,cC.countCredit(cC.amount,cC.year,cC.percent));
    }
}
