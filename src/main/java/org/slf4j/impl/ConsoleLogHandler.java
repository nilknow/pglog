package org.slf4j.impl;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleLogHandler implements LogHandler{
    private static final OutputStream out = System.out;
    private static final EventParser eventParser = new EventParser();

    @Override
    public void publish(LogEvent logEvent) {
        byte[] msg = eventParser.parse(logEvent);
        try {
            out.write(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
