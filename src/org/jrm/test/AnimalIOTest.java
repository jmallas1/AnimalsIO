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
// TODO: Write & address anti-cases
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
        assertNotNull(someCat);
        assertEquals("Felix", someCat.getName(), "This cat should be named Felix");
        assertEquals(3, someCat.getMousesKilled(), "There should be three dead mice");
    }

    @Test
    void genDog()
    {
        Dog someDog = aio.genDog("Trooper", "true");
        assertNotNull(someDog);
        assertEquals("Trooper", someDog.getName(), "This dog should be named Trooper");
        assertTrue(someDog.isFriendly());
    }

    @Test
    void genStudent()
    {
        Student someStudent = aio.genStudent("Jared", "42");
        assertNotNull(someStudent);
        assertEquals(42, someStudent.getAge());
        assertEquals("Jared", someStudent.getName(), "This student should be named Jared");
    }
}