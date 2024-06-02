package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class subtTest {

    @Test
    void sub() {
       Main obj = new Main();
       int acutal = obj.sub(15,4);
       assertEquals(11,acutal);
    }
}