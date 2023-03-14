package com.hillel.pinkovskiy.homeworks.homework8;


public class FileLogger {
    private FileLoggerConfiguration config;
    private FileLogger writer;

    public FileLogger(FileLoggerConfiguration config) {
        this.config = config;
    }

    public void debug(String message) throws FileMaxSizeReachedException {
        log((LoggingLevel) LoggingLevel.DEBUG, message);
    }

    public void info(String message) throws FileMaxSizeReachedException {
        log((LoggingLevel) LoggingLevel.INFO, message);
    }

    private void log(LoggingLevel level, String message) throws FileMaxSizeReachedException {
        if (level.ordinal() > config.getLogLevel().ordinal()) {
            return;
        }

    }


}
