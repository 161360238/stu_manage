package com.pdsu.stuManage.exception;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 *自定义异常处理
 */
public class CustomExceptionResolver implements HandlerExceptionResolver  {
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		//输出异常
		//ex.printStackTrace();
		
		//异常信息
		String message = null;
		CustomException customException = null;
		//如果ex是系统 自定义的异常，直接取出异常信息
		if(ex instanceof CustomException){
			customException = (CustomException)ex;
		}else{
			//针对非CustomException异常，对这类重新构造成一个CustomException，异常信息为“未知错误”
			customException = new CustomException("未知错误");
		}
		
		//错误 信息
		message = customException.getMessage();
			
		//将错误信息返回到前端页面
		if(message.equals("用户名不存在") || message.equals("密码错误") || message.equals("验证码错误") || message.equals("未知错误")){	
			if(message.equals("未知错误")){
				message = "网络出错了";
			}
			try {
				response.setStatus(200);
				response.getWriter().write(message);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return new ModelAndView();
	}

}
