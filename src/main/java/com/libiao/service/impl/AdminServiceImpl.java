package com.libiao.service.impl;

import com.libiao.dao.AdminDao;
import com.libiao.dao.AdminPostDao;
import com.libiao.dao.AdminUserDao;
import com.libiao.pojo.Admin;
import com.libiao.pojo.AdminPost;
import com.libiao.pojo.AdminUser;
import com.libiao.pojo.User;
import com.libiao.service.AdminService;
import com.libiao.service.PostService;
import com.libiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    @Autowired
    private AdminDao adminDao;

    @Autowired
    private AdminPostDao adminPostDao;

    @Autowired
    private AdminUserDao adminUserDao;

    @Override
    public boolean deletePost(Long id) {
        if(postService.deletePost(id)){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUser(Integer id) {
        if(userService.deleteUser(id)){
            return true;
        }
        return false;
    }
    @Override
    public boolean check(String adminName, String password) {
        List<Admin> admins = adminDao.findAll();
        for (Admin admin:admins) {
            if (admin.getAName().equals(adminName) && admin.getAPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Admin findAdminByName(String adminName) {
        List<Admin> admins = adminDao.findAll();
        for (Admin admin:
                admins) {
            if (admin.getAName().equals(adminName)){
                return admin;
            }
        }
        return null;
    }

    @Override
    public boolean postDelLog(Long adminId, Long postId){
        AdminPost adminPost=null;
        adminPost.setAId(adminId);
        adminPost.setPId(postId);
        try{
            adminPostDao.save(adminPost);
            return true;
        }catch(Exception e){
            System.out.println("帖子删除记录失败!");
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public boolean userDelLog(Long adminId, Long userId){
        AdminUser adminUser=null;

        adminUser.setAId(adminId);
        adminUser.setUId(userId);
        try{
            adminUserDao.save(adminUser);
            return true;
        }catch(Exception e){
            System.out.println("记录用户删除失败!");
            e.printStackTrace();
        }
        return false;
    }
}
