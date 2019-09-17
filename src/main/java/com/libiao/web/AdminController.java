package com.libiao.web;

import com.libiao.pojo.Admin;
import com.libiao.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping(value = "/checkAdmin",method = RequestMethod.POST)
    public String check(@RequestBody Admin admin, HttpServletRequest request) {
        boolean f = adminService.check(admin.getAName(), admin.getAPassword());
        if (f == true){
            admin=adminService.findAdminByName(admin.getAName());
            request.getSession().setAttribute("admin", admin);
            System.out.println(admin);
            return "登陆成功";
        }
        return "loginErr";
    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    public String deleteUser(HttpServletRequest request, @RequestBody Integer id){
        /*Admin admin=(Admin)request.getSession().getAttribute("admin");*/
        if(adminService.deleteUser(id)){
            /*adminService.userDelLog(admin.getAId().longValue(),id.longValue());*/
            return "Success";
        }
        return "";
    }
    @RequestMapping(value = "/deletePost",method = RequestMethod.POST)
    public String deletePost(HttpServletRequest request, @RequestBody Integer id){
        /*Admin admin=(Admin)request.getSession().getAttribute("admin");*/
        if(adminService.deletePost(id.longValue())){
            /*adminService.postDelLog(admin.getAId().longValue(),id.longValue());*/
            return "Success";
        }
        return "";
    }
}
