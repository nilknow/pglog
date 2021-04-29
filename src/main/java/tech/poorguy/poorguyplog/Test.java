package tech.poorguy.poorguyplog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        logger.error("error level log");
        logger.warn("warn level log");
        logger.info("info level log");
        logger.debug("debug level log");
        logger.trace("trace level log");
    }
}
