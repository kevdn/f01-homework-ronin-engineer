package org.example.elearningproject.service;

import org.springframework.stereotype.Service;
import org.example.elearningproject.dto.request.AdminLoginReq;

@Service
public interface AdminService {

    Object login(AdminLoginReq req);

    Object deleteUser(String userId);

}
