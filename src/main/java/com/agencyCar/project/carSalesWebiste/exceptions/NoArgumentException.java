package com.agencyCar.project.carSalesWebiste.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoArgumentException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public NoArgumentException() {
    }

    public NoArgumentException(String message) {
        super(message);
    }

    public NoArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}
