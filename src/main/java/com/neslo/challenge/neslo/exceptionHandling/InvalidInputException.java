package com.neslo.challenge.neslo.exceptionHandling;


public class InvalidInputException extends RuntimeException {

    public InvalidInputException(String exception) {
        super(exception);
    }

}