package com.SpringExample.controller;

import com.SpringExample.pojo.AdminLoginParam;
import com.SpringExample.pojo.RespBean;
import com.SpringExample.service.IAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "LoginController")
@RestController
public class LoginController {

    private IAdminService adminService;
    @ApiOperation(value = "登录之后返回token")
    @PostMapping("/login")
    public RespBean login(AdminLoginParam adminLoginParam , HttpServletRequest request){
        return adminService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword(),request);
    }
}
