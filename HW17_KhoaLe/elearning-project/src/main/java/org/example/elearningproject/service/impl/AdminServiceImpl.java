package org.example.elearningproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.elearningproject.service.AdminService;
import org.example.elearningproject.service.validator.AdminValidatorService;
import org.example.elearningproject.dto.request.AdminLoginReq;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminValidatorService adminValidatorService;

    public Object login(AdminLoginReq req) {
        adminValidatorService.validateLogin(req);
        return req;
    }

    public Object deleteUser(String userId) {
        return userId;
    }


}
