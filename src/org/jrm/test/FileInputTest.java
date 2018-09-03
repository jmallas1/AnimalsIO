package org.jrm.test;

import org.jrm.FileInput;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileInputTest {

    FileInput fi;

    @BeforeEach
    void setUp() { fi = new FileInput("./src/org/jrm/test/FileInputTest.java"); }

    @AfterEach
    void tearDown() { fi.fileClose(); fi = null; }


    // TODO: This test
    @DisplayName("Known line can be read")
    @Test
    void fileReadLine()
    {
        // Happy path...
        assertEquals("package org.jrm.test;", fi.fileReadLine());

        // Unhappy path
        fi = new FileInput("./src/org/jrm/FileInputTst.java");
        assertNull(fi.fileReadLine());
    }

}