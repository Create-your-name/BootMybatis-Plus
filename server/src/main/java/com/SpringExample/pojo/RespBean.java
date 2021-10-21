package com.SpringExample.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  *     公共返回对象
  *@Author 刘海
  *@Data 22:09 2021/10/21
  *@Param
  *@return
  */
@Data
@NoArgsConstructor  //无参构造
@AllArgsConstructor // 全参构造

public class RespBean {
    private  long code ;
    private  String message ;
    private  Object obj;

    /**
      *     成功返回
      *@Author 刘海
      *@Data 22:11 2021/10/21
      *@Param
      *@return
      */
    public  static  RespBean success (String message){
        return new RespBean(200,message,null);
    }
    /**
      *
      *@Author 刘海
      *@Data 22:12 2021/10/21
      *@Param
      *@return
      */
    public  static  RespBean success (String message,Object obj){
        return new RespBean(200,message,obj);
    }

    /**
     * 失败返回结果
     * @param message
     * @return
     */
    public static RespBean error(String message){
        return new RespBean(500,message,null);
    }

    /**
     * 失败返回结果
     * @param message
     * @param obj
     * @return
     */
    public static RespBean error(String message,Object obj){
        return new RespBean(500,message,obj);
    }

}
