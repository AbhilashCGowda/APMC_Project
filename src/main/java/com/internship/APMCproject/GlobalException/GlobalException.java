package com.internship.APMCproject.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> GlobalExceptionHandler(RuntimeException runtimeException)
    {
        return new ResponseEntity<>(runtimeException.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
