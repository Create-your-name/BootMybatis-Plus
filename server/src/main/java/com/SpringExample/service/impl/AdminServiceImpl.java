package com.SpringExample.service.impl;

import com.SpringExample.config.security.JwtTokenUtil;
import com.SpringExample.mapper.AdminMapper;
import com.SpringExample.pojo.Admin;
import com.SpringExample.pojo.RespBean;
import com.SpringExample.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuhai
 * @since 2021-10-20
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

    @Autowired
    private  UserDetailsService userDetailsService;
    @Autowired
    private  PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Value("${jwt.tokenHead}")
    private  String tokenHead;
    /**
     * 登录后返回token
     *
     * @param username
     * @param password
     * @param request
     * @return
     * @Author 刘海
     * @Data 22:53 2021/10/21
     * @Param
     */
    @Override
    public RespBean login(String username, String password, HttpServletRequest request) {
        //登录
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if (null==userDetails||!passwordEncoder.matches(password,userDetails.getPassword())){
            return RespBean.error("用户名或密码不正确");
        }
        if (!userDetails.isEnabled()){
            return RespBean.error("账号被禁用，请联系管理员！");
        }
        //更新security登录用户对象
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails
                ,null,userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        //生成token
        String token = jwtTokenUtil.generateToken(userDetails);
        Map<String,String> tokenMap = new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return  RespBean.success("登录成功",tokenMap);
    }
}
