package org.slf4j.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class ConsoleLogHandler implements LogHandler{
    private static final OutputStream out = System.out;
    private static final EventParser eventParser = new EventParser();

    @Override
    public void publish(LogEvent logEvent) {
        byte[] msg = eventParser.parse(logEvent);
        try {
            out.write(("["+logEvent.getLevel().levelStr()+"]").getBytes(StandardCharsets.UTF_8));
            out.write(msg);
            out.write("\n".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
