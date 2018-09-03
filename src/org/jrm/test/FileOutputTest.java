package org.jrm.test;

import org.jrm.FileInput;
import org.jrm.FileOutput;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileOutputTest {

    private FileOutput outFile;

    @BeforeEach
    void setUp() { outFile = new FileOutput("writer.out.txt"); }

    @AfterEach
    void tearDown() { outFile.fileClose(); outFile = null; }

    // TODO: This test
    @DisplayName("Known file can be written to")
    @Test
    void fileWrite() {
        outFile.fileWrite("This is a testable line");
        outFile.fileClose(); // close the file to force (what appears to be) an async write...
        FileInput fi = new FileInput("writer.out.txt");
        assertEquals("This is a testable line", fi.fileReadLine(), "Line should be read");
    }

}