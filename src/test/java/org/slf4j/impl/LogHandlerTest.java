package org.slf4j.impl;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class LogHandlerTest {
    @Test
    void streamMethod() throws IOException {
        PrintStream out = System.out;
        out.write("Hello".getBytes(StandardCharsets.UTF_8));
        System.out.println(">>>");
        out.write("world\n".getBytes(StandardCharsets.UTF_8));
        out.flush();
        out.write("interesting".getBytes(StandardCharsets.UTF_8));
        out.close();
    }

}