package com.example.demo.CamelCase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamelCaseTest {

    @Test
    public void testTwoWords() {
        assertEquals("TestCase", new CamelCase().camelCase("test case"));
    }

    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", new CamelCase().camelCase("camel case method"));
    }

    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", new CamelCase().camelCase(" camel case word"));
    }

    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", new CamelCase().camelCase("say hello "));
    }

    @Test
    public void testSingleLetter() {
        assertEquals("Z", new CamelCase().camelCase("z"));
    }

    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", new CamelCase().camelCase("ab  c"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", new CamelCase().camelCase(""));
    }
}
