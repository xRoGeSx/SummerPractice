package com.example.file_service_SPRING.exception;

public class FileStorageException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 2164537374909598341L;

    public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}