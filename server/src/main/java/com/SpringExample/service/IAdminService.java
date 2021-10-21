package com.SpringExample.service;

import com.SpringExample.pojo.Admin;
import com.SpringExample.pojo.RespBean;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuhai
 * @since 2021-10-20
 */
public interface IAdminService extends IService<Admin> {

    /**
      * 登录后返回token
      *@Author 刘海
      *@Data 22:53 2021/10/21
      *@Param
      *@return
      */
    RespBean login(String username, String password , HttpServletRequest request);
}
