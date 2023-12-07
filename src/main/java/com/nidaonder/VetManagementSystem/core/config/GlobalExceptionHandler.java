package com.nidaonder.VetManagementSystem.core.config;

import com.nidaonder.VetManagementSystem.core.exception.DataExistsException;
import com.nidaonder.VetManagementSystem.core.exception.NotFoundException;
import com.nidaonder.VetManagementSystem.core.result.Result;
import com.nidaonder.VetManagementSystem.core.utilities.ResultHelper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Result> handleNotFoundException(NotFoundException e){
        return new ResponseEntity<>(ResultHelper.notFoundError(e.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DataExistsException.class)
    public ResponseEntity<Result> handleDataExistsException(DataExistsException e){
        return new ResponseEntity<>(ResultHelper.dataAlreadyExistError(e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
