package com.libiao.web;

import com.libiao.pojo.User;
import com.libiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /*@RequestMapping(value = "/login/{username}/{password}", method = RequestMethod.GET)
    public boolean login(@PathVariable("username") String userName, @PathVariable("password") String password){
        return userService.check(userName,password);
    }*/

    @RequestMapping("/")
    public String index() {
        return "redirect:/gallery";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/loginOut")
    public String loginOut(HttpServletRequest request){
        request.getSession().invalidate();
        return "gallery";
    }

    @RequestMapping(value = "/check")
    public String check(User user, HttpServletRequest request) {
        boolean f = userService.check(user.getU_name(), user.getU_password());
        if (f == true){
            request.getSession().setAttribute("userName", user.getU_name());
            return "gallery";
        }
        return "loginErr";
    }
    /*@RequestMapping(value = "/check")
    public String check(HttpServletRequest request) {
        String username = request.getParameter("form-username");
        String password = request.getParameter("form-password");
        boolean f = userService.check(username, password);
        if (f == true){
            return "index";
        }
        return "loginErr";
    }*/

    @RequestMapping("/addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/gallery")
    public String gallery(){
        return "gallery";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping("/codes")
    public String codes(){
        return "codes";
    }

    @RequestMapping("/index")
    public String index2(){
        return "index";
    }
}
