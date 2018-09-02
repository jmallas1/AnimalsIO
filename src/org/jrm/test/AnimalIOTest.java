package org.jrm.test;

import org.jrm.AnimalIO;
import org.jrm.Cat;
import org.jrm.Dog;
import org.jrm.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class AnimalIOTest {

    private AnimalIO aio;

    @BeforeEach
    void setUp() { aio = new AnimalIO(); }

    @AfterEach
    void tearDown() { aio = null; }

    @Test
    void genCat()
    {
        Cat someCat = aio.genCat("Felix", "3");
        assertEquals("Felix", someCat.getName(), "This cat should be named Felix");
        assertEquals(3, someCat.getMousesKilled(), "There should be three dead mice");
    }

    @Test
    void genDog()
    {
        Dog someDog = aio.genDog();
        assertTrue(someDog instanceof org.jrm.Dog);
    }

    @Test
    void genStudent()
    {
        Student someStudent = aio.genStudent();
        assertTrue(someStudent instanceof org.jrm.Student);
    }
}