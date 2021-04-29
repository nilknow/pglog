package org.slf4j.impl;

public class Level {

    public static final Level NONE = new Level(Integer.MAX_VALUE, "ERROR");
    public static final Level ERROR = new Level(1000, "ERROR");
    public static final Level WARN = new Level(900, "WARN");
    public static final Level INFO = new Level(800, "INFO");
    public static final Level DEBUG = new Level(700, "DEBUG");
    public static final Level TRACE = new Level(600, "TRACE");
    public static final Level ALL = new Level(0, "TRACE");

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
