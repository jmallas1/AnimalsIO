package org.jrm.test;

import org.jrm.AnimalIO;
import org.jrm.Cat;
import org.jrm.Dog;
import org.jrm.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// DONE: Write & address anti-cases
class AnimalIOTest {

    private AnimalIO aio;

    @BeforeEach
    void setUp() { aio = new AnimalIO(); }

    @AfterEach
    void tearDown() { aio = null; }

    @Test
    void genCat()
    {
        Cat someCat = aio.addCat("Felix", "3");
        assertNotNull(someCat);
        assertEquals("Felix", someCat.getName(), "This cat should be named Felix");
        assertEquals(3, someCat.getMousesKilled(), "There should be three dead mice");

        assertThrows(IllegalArgumentException.class, ()->{ aio.addCat("F3lix", "3"); }, "Should throw exception on non-alpha name");
    }

    @Test
    void genDog()
    {
        Dog someDog = aio.addDog("Trooper", "true");
        assertNotNull(someDog);
        assertEquals("Trooper", someDog.getName(), "This dog should be named Trooper");
        assertTrue(someDog.isFriendly());

        assertThrows(IllegalArgumentException.class, ()-> { aio.addDog("Tr00p3r", "true"); });
    }

    @Test
    void genStudent()
    {
        Student someStudent = aio.addStudent("Jared", "42");
        assertNotNull(someStudent);
        assertEquals(42, someStudent.getAge());
        assertEquals("Jared", someStudent.getName(), "This student should be named Jared");

        assertThrows(IllegalArgumentException.class, ()-> { aio.addStudent("Jar3d", "42"); });
    }
}