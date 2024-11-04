package org.example.elearningproject.service.impl;

import org.example.elearningproject.service.validator.BaseValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.elearningproject.service.AdminService;
import org.example.elearningproject.dto.request.AdminLoginReq;
import org.springframework.validation.BindingResult;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminValidatorService adminValidatorService;

    @Autowired
    private BaseValidationService baseValidationService;

    @Override
    public Object login(AdminLoginReq req) {
        adminValidatorService.validateLogin(req);
        return req;
    }

    @Override
    public Object login(AdminLoginReq req, BindingResult bindingResult) {
        Object errors = baseValidationService.handleFieldExcpetion(bindingResult);
        if (errors != null) {
            return errors;
        }
        return req;
    }

    public Object deleteUser(String userId) {
        return userId;
    }


}

