package org.example.elearningproject.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import org.example.elearningproject.exception.AppException;


@ControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(AppException.class)
    public ResponseEntity<Object> handleAppException(AppException e) {
        return ResponseEntity.
                status(HttpStatus.BAD_REQUEST).
                body(e.getMessage());
    }
}
