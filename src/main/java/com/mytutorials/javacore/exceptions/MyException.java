package com.mytutorials.javacore.exceptions;

import java.io.Serial;

public class MyException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    private String errorCode = "Unknown_Exception";

    public MyException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

}
