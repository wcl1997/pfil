package com.libiao.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
    }
    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
    }
    @Override
    public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
        //普通路径放行
        /*if ("/check".equals(arg0.getRequestURI()) || "/login".equals(arg0.getRequestURI())) {
            return true;}
        //权限路径拦截
        Object object = arg0.getSession().getAttribute("userName");
        if (null == object) {
            arg1.sendRedirect("/login");
            return false;}*/
        return true;
    }
}
