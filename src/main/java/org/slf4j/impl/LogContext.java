package org.slf4j.impl;

import org.slf4j.ILoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class LogContext implements ILoggerFactory {
    private final Logger root;
    private final Map<String, Logger> loggerCache = new HashMap<>();

    public LogContext() {
        this.root = new Logger(Logger.ROOT_LOGGER_NAME,null,null);
        this.root.addHandler(new ConsoleLogHandler());
    }

    @Override
    public Logger getLogger(String name) {
        if (Logger.ROOT_LOGGER_NAME.equalsIgnoreCase(name)) {
            return root;
        }
        Logger childLogger = loggerCache.get(name);
        if (childLogger != null) {
            return childLogger;
        }

        Logger logger = root;
        String childName;
        int i = 0;
        while (true) {
            int t = name.indexOf('.', i);
            if (t == -1) {
                childName = name;
            } else {
                childName = name.substring(0, t);
            }

            childLogger = logger.getChildByName(childName);
            if (childLogger != null) {
                return childLogger;
            } else {
                i=t+1;
                synchronized (logger) {
                    childLogger = logger.createChildLogger(childName);
                    childLogger.addHandler(new ConsoleLogHandler());
                    loggerCache.put(childName, childLogger);
                }
            }
            if (childName.equals(name)) {
                return childLogger;
            }
            logger = childLogger;
        }
    }
}
