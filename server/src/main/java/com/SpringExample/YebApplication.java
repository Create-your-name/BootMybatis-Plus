package com.SpringExample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
  * 自动类
  *@Author 刘海
  *@Data 20:13 2021/10/20
  *@Param
  *@return
  */

@SpringBootApplication
@MapperScan("con.SpringExample.mapper")
public class YebApplication {
    public static void main(String[] args){
        SpringApplication.run(YebApplication.class,args);
    }
}
