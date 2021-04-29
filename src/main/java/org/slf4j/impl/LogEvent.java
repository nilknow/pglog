package org.slf4j.impl;

import java.time.Instant;

public class LogEvent {
    private long ThreadId;
    private String msg;
    private Level level;
    private Instant instant;
    private LogHandler logHandler;

    public LogEvent(String msg, Level level) {
        this.msg = msg;
        this.level = level;
        this.instant = Instant.now();
    }

    public String getMsg(){
        return this.msg;
    }

    public static void main(String[] args){
        Thread.currentThread().getId();
    }
}
