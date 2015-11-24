package com.espark.adarsh.exception;

import java.io.Serializable;

public class MyApplicationException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    public MyApplicationException() {
        super();
    }

    public MyApplicationException(String msg) {
        super(msg);
    }

    public MyApplicationException(String msg, Exception e) {
        super(msg, e);
    }
}
