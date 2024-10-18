package org.example.elearningproject.service;

import org.springframework.stereotype.Service;
import org.example.elearningproject.dto.request.AdminLoginReq;
import org.springframework.validation.BindingResult;

@Service
public interface AdminService {

    Object login(AdminLoginReq req, BindingResult bindingResult);

    Object login(AdminLoginReq req);

    Object deleteUser(String userId);



}
