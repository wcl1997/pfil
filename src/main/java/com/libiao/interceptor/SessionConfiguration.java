package com.libiao.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//1111
@Configuration
// web配置文件（web.xml）添加一个拦截器
public class SessionConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry ){
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/");
        //网站配置生成器：添加一个拦截器，拦截路径为整个项目
    }
}
