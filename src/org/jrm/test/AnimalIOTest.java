package org.jrm.test;

import org.jrm.Cat;
import org.jrm.Dog;
import org.jrm.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalIOTest {

    AnimalIOTest aiot;

    @BeforeEach
    void setUp() { aiot = new AnimalIOTest(); }

    @AfterEach
    void tearDown() { aiot = null; }

    @Test
    void genCat()
    {
        Cat someCat = aiot.genCat();
        assertTrue(someCat instanceof org.jrm.Cat);
    }

    @Test
    void genDog()
    {
        Dog someDog = aiot.genDog();
        assertTrue(someDog instanceof org.jrm.Dog);
    }

    @Test
    void genStudent()
    {
        Student someStudent = aiot.genStudent();
        assertTrue(someStudent instanceof org.jrm.Student);
    }
}