package com.example.demo.RomanNumeralsEncoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsEncoderTest {

    RomanNumeralsEncoder romanNumeralsEncoder = new RomanNumeralsEncoder();

    @Test
    public void shouldConvertToRoman() {
        assertEquals( "I", romanNumeralsEncoder.solution(1));
        assertEquals( "IV", romanNumeralsEncoder.solution(4));
        assertEquals( "VI", romanNumeralsEncoder.solution(6));
        assertEquals( "XX", romanNumeralsEncoder.solution(20));
        assertEquals( "XCIX", romanNumeralsEncoder.solution(99));
        assertEquals( "CDL", romanNumeralsEncoder.solution(450));
        assertEquals( "DCCLXXVII", romanNumeralsEncoder.solution(777));
        assertEquals( "MCMXC", romanNumeralsEncoder.solution(1990));
        assertEquals( "MMVIII", romanNumeralsEncoder.solution(2008));
        assertEquals( "MDCLXVI", romanNumeralsEncoder.solution(1666));
    }
}
