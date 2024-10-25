package org.example.elearningproject.controller;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.example.elearningproject.constant.UrlConstant;
import org.example.elearningproject.dto.request.AdminLoginReq;
import org.example.elearningproject.service.AdminService;

@RestController
@RequestMapping(UrlConstant.API_V1)
public class AdminController {

    @Autowired
    @Qualifier("adminServiceImpl")
    private AdminService adminService;

    @PostMapping(UrlConstant.ADMIN_LOGIN)
    public Object login(@Valid @RequestBody AdminLoginReq req, BindingResult result) {
        return adminService.login(req, result);
    }

    @DeleteMapping(UrlConstant.ADMIN_USER_DELETE)
    public Object removeUser(@PathVariable("user_id") String userId) {
        return adminService.deleteUser(userId);
    }




    
}
