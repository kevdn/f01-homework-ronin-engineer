package org.example.elearningproject.exception.handler;

import org.example.elearningproject.service.validator.BaseValidationService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.FileNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

    private final BaseValidationService baseValidationService;

    public GlobalExceptionHandler(BaseValidationService baseValidationService) {
        this.baseValidationService = baseValidationService;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception ex) {
        return ResponseEntity.
                internalServerError().
                body(ex.getMessage());

    }

    @ExceptionHandler({NullPointerException.class, FileNotFoundException.class})
    public ResponseEntity<Object> handleNullPointerException(Exception ex) {
        return ResponseEntity.
                internalServerError().
                body(ex.getMessage());
    }

    @ExceptionHandler({BindException.class})
    public ResponseEntity<Object> handleBindException(BindException ex) {
        return ResponseEntity.
                badRequest().
                body(baseValidationService.handleFieldExcpetion(ex.getBindingResult()));
    }




}
