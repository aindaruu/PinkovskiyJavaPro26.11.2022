package com.hillel.pinkovskiy.homeworks.homework8;

import java.io.File;

public class FileLoggerConfiguration {
    private File logFile;
    private LoggingLevel logLevel;
    private int maxFileSize;
    private int maxFileCount;
    private String logFormat;

    public FileLoggerConfiguration(File logFile, LoggingLevel logLevel,
                                   int maxFileSize, int maxFileCount, String logFormat) {
        this.logFile = logFile;
        this.logLevel = logLevel;
        this.maxFileSize = maxFileSize;
        this.maxFileCount = maxFileCount;
        this.logFormat = logFormat;
    }

    public File getLogFile() {
        return logFile;
    }

    public LoggingLevel getLogLevel() {
        return logLevel;
    }

    public int getMaxFileSize() {
        return maxFileSize;
    }

    public int getMaxFileCount() {
        return maxFileCount;
    }

    public String getLogFormat() {
        return logFormat;
    }

}
