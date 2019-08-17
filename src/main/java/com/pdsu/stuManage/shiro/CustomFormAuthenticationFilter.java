package com.pdsu.stuManage.shiro;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
/**
 * 自定义的CustomFormAuthenticationFilter 在认证之前 实现验证码的校验
 * @author hasee
 *
 */
public class CustomFormAuthenticationFilter extends FormAuthenticationFilter{
	
	//原FormAuthenticationFilter的认证方法
	//进行验证码的校验
	@Override
	protected boolean onAccessDenied(ServletRequest request,ServletResponse response) throws Exception {
		//获取session
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		HttpSession session = httpServletRequest.getSession();
	
		//取出session中的验证码(生成的)
		String validateCode = (String) session.getAttribute("validateCode");
		
		//取出页面用户输入的验证码
		String randomcode = httpServletRequest.getParameter("randomCode");
		
		//判断用户验证码是否正确
		if(validateCode != null && randomcode != null && !validateCode.equals(randomcode)){
			//不正确 ,将验证码验证失败信息放入的request域中名为shiroLoginFailure
			httpServletRequest.setAttribute("shiroLoginFailure", "randomcodeError");
						 
			//拒绝访问,不再校验账号和密码
			return true;
		}
		
		return super.onAccessDenied(request, response);
	}

}
