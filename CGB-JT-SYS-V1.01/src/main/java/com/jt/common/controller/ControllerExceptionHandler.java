package com.jt.common.controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.common.vo.JsonResult;
@ControllerAdvice
public class ControllerExceptionHandler {
     @ExceptionHandler(RuntimeException.class )
	 @ResponseBody
     public JsonResult doHandleRunException(
			 RuntimeException e){
		 e.printStackTrace();
		 return new JsonResult(e);
	 }
     //网络,死机,被烧了..
     @ExceptionHandler(Throwable.class )
     @ResponseBody
     public JsonResult doHandleSysException(
    		 Throwable e){
    	 e.printStackTrace();//记录日志
    	 //发短信
    	 return new JsonResult("系统维护中,稍后再试");
     }
     
     
}




