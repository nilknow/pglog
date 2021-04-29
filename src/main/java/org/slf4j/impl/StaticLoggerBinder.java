package org.slf4j.impl;

import org.slf4j.ILoggerFactory;

public class StaticLoggerBinder {
    public static String REQUESTED_API_VERSION = "1.6";
    private static final StaticLoggerBinder INSTANCE = new StaticLoggerBinder();
    private static final ILoggerFactory loggerFactory = new LogContext();

    private StaticLoggerBinder() {
    }

    public static StaticLoggerBinder getSingleton() {
        return INSTANCE;
    }

    public ILoggerFactory getLoggerFactory() {
        return loggerFactory;
    }

    public String getLoggerFactoryClassStr() {
        return loggerFactory.getClass().getName();
    }

}
