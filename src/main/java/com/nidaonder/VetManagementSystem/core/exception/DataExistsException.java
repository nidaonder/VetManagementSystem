package com.nidaonder.VetManagementSystem.core.exception;

public class DataExistsException extends RuntimeException {
    public DataExistsException(String message){
        super(message);
    }
}
