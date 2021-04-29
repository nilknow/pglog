package org.slf4j.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogContextTest {

    @Test
    void stringMethod() {
        String className = Level.class.getName();
        int dotIndex = className.indexOf('.');
        assertEquals(dotIndex, 3);
        String substring = className.substring(0, dotIndex);
        assertEquals(substring, "org");
        String rightSubstring = className.substring(dotIndex + 1);
        assertEquals(rightSubstring,"slf4j.impl.Level");
    }
}