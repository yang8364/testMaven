package com.etoak.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SystemLoginInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//获取url地址  
        /*String reqUrl=request.getRequestURI().replace(request.getContextPath(), "");  
        //当url地址为登录的url的时候跳过拦截器  
        if(reqUrl.contains("/login.htm")){  
            return true;  
        }else{  
            HttpSession session=request.getSession();  
            Object obj=session.getAttribute("user");  
            if(obj==null||"".equals(obj.toString())){  
                response.sendRedirect("error.jsp");  
            }  
        }*/  
		
		
		
		System.out.println("ceshi ");
        return true;  
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
		
	}

}
