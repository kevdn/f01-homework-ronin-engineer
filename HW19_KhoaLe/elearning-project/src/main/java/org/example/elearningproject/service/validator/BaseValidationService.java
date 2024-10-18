package org.example.elearningproject.service.validator;

import org.example.elearningproject.dto.response.AppError;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

@Service
public class BaseValidationService {

    public List<AppError> handleFieldExcpetion(BindingResult bindingResult) {

        if (bindingResult.hasErrors()){
            return null;
        }

        List<AppError> errors = new ArrayList<>();

        AppError error;
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            error = new AppError();
            error.setField(fieldError.getField());
            error.setMessage(fieldError.getDefaultMessage());
            errors.add(error);
        }

        return errors;
    }
}
