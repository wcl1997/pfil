package com.libiao.web;

import com.libiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /*@RequestMapping(value = "/login/{username}/{password}", method = RequestMethod.GET)
    public boolean login(@PathVariable("username") String userName, @PathVariable("password") String password){
        return userService.check(userName,password);
    }*/

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String index(){
        return "login";
    }

    @RequestMapping(value = "/check",method = RequestMethod.POST)
    public String check(HttpServletRequest request) {
        String username = request.getParameter("form-username");
        String password = request.getParameter("form-password");
        boolean f = userService.check(username, password);
        if (f == true){
            return "index";
        }
        return "loginErr";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(){
        return "register";
    }
}
