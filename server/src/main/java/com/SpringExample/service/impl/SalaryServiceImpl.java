package com.SpringExample.service.impl;

import com.SpringExample.mapper.SalaryMapper;
import com.SpringExample.pojo.Salary;
import com.SpringExample.service.ISalaryService;
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
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary> implements ISalaryService {

}
