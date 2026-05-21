package com.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        assertEquals(8, App.add(5, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(6, App.subtract(10, 4));
    }

    @Test
    public void testMultiply() {
        assertEquals(42, App.multiply(6, 7));
    }

    @Test
    public void testGreeting() {
        assertEquals("Hello from Java + Gradle CI/CD!", App.getGreeting());
    }
}
