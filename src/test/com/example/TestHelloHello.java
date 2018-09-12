package com.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestHelloHello {

    private HelloHello helloHello;

    @Before
    public void setUp() {
        helloHello = new HelloHello();
    }

    @Test
    public void testHelloEmpty() {
        assertEquals(helloHello.getGreeting(), "hello");
    }
}