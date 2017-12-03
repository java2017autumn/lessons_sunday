package com.javaguru.lesson11.exceptions;

public class CustomerValidationException extends RuntimeException {

    public CustomerValidationException(String message) {
        super(message);
    }
}
