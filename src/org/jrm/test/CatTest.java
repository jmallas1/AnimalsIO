package org.jrm.test;

import org.jrm.Cat;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat someCat;

    @org.junit.jupiter.api.BeforeEach
    void setUp() { someCat = new Cat(6, "Felix"); }

    @org.junit.jupiter.api.AfterEach
    void tearDown() { someCat = null; }

    @org.junit.jupiter.api.Test
    void getMousesKilled() { assertEquals(6, someCat.getMousesKilled(), "There should be six dead mice,"); }

    @org.junit.jupiter.api.Test
    void addMouse()
    {
        someCat.addMouse();
        assertEquals(7, someCat.getMousesKilled(), "There should be 7 dead mice");
    }
}