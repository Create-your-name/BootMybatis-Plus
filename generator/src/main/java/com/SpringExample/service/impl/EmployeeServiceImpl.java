package com.SpringExample.service.impl;

import com.SpringExample.pojo.Employee;
import com.SpringExample.mapper.EmployeeMapper;
import com.SpringExample.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
