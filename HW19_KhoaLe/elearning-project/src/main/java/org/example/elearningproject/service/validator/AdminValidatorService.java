package org.example.elearningproject.service.validator;

import org.springframework.stereotype.Service;
import org.example.elearningproject.dto.request.AdminLoginReq;

@Service
public class AdminValidatorService {

    public String validateLogin(AdminLoginReq req) {
        if (req.getUsername() == null || req.getUsername().isEmpty()) {
            return "Username is required";
        }

        if (req.getPassword() == null || req.getPassword().isEmpty()) {
            return "Password is required";
        }

        if (req.getPassword().length() < 8) {
            return "Password must be at least 8 characters";
        }

        return null;
    }


}
