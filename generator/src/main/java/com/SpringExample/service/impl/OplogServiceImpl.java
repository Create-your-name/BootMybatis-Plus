package com.SpringExample.service.impl;

import com.SpringExample.pojo.Oplog;
import com.SpringExample.mapper.OplogMapper;
import com.SpringExample.service.IOplogService;
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
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
