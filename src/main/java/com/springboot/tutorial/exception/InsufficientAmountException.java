package com.springboot.tutorial.exception;

/**
 * @author arlund
 */
public class InsufficientAmountException extends RuntimeException{

    public InsufficientAmountException(String message) {
        super(message);
    }

}
