package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalciTest {

    @BeforeAll
    static void init() {
        System.out.println("In before all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before each test");
    }

    @Test
    void testAdd() {
        Calci c = new Calci();
        int result = c.add(2, 3);
        int expected = 5;
        System.out.println("Test1");
        assertEquals(expected, result);
    }
    
    @Test
    void testAdd2() {
        Calci c = new Calci();
        int result = c.add(2, 3);
        int expected = 5;
        System.out.println("Test2");
        assertEquals(expected, result);
    }
}
