package com.SpringExample.service.impl;

import com.SpringExample.pojo.Admin;
import com.SpringExample.mapper.AdminMapper;
import com.SpringExample.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
