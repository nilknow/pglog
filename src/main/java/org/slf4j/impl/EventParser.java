package org.slf4j.impl;

import java.nio.charset.StandardCharsets;

public class EventParser {
    public byte[] parse(LogEvent event){
        return event.getMsg().getBytes(StandardCharsets.UTF_8);
    }
}
