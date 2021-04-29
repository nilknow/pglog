package org.slf4j.impl;

public class Level {
    public static final Level ERROR = new Level(1000, "ERROR");
    public static final Level WARN = new Level(1000, "WARN");
    public static final Level INFO = new Level(1000, "INFO");
    public static final Level DEBUG = new Level(1000, "DEBUG");
    public static final Level TRACE = new Level(1000, "TRACE");

    private int levelInt;
    private String description;

    Level(int levelInt, String description) {
        this.levelInt = levelInt;
        this.description = description;
    }

    public int levelInt(){
        return this.levelInt;
    }
}
