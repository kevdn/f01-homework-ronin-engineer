package org.example.elearningproject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.example.elearningproject.constant.UrlConstant;
import org.example.elearningproject.dto.request.AdminLoginReq;
import org.example.elearningproject.service.AdminService;

@RestController
public class AdminController {

    @Autowired
    @Qualifier("adminServiceImpl")
    private AdminService adminService;

    @PostMapping(UrlConstant.ADMIN_LOGIN)
    public Object login(@RequestBody AdminLoginReq req) {
        return adminService.login(req);
    }

    @DeleteMapping(UrlConstant.ADMIN_USER_DELETE)
    public Object removeUser(@PathVariable("user_id") String userId) {
        return adminService.deleteUser(userId);
    }




    
}
