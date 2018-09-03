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
    void setUp() { fi = new FileInput("./src/org/jrm/FileInputTest.java"); }

    @AfterEach
    void tearDown() { fi.fileClose(); fi = null; }

    // TODO: This test
    @DisplayName("Known file can be read")
    @Test
    void fileRead()
    {
    }

    // TODO: This test
    @DisplayName("Known line can be read")
    @Test
    void fileReadLine() {
    }

    // TODO: This test
    @DisplayName("File / filehandle can be closed")
    @Test
    void fileClose() {
    }
}