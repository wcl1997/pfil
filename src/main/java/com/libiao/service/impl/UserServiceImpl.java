package com.libiao.service.impl;

import com.libiao.dao.UserDao;
import com.libiao.pojo.User;
import com.libiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        boolean flag = false;
        try {
            userDao.save(user);
            flag = true;
        } catch (Exception e){
            System.out.println("新增失败！");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateUser(User user) {
        boolean flag=false;
        try{
            userDao.save(user);
            flag=true;
        }catch(Exception e){
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteUser(Integer id) {
        boolean flag=false;
        try{
            userDao.delete(id);
            flag=true;
        }catch(Exception e){
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public User findUserById(Integer id) {
        return userDao.findOne(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public boolean check(String userName, String password) {
        List<User> users = userDao.findAll();
        for (User user:
             users) {
            if (user.getU_name().equals(userName) && user.getU_password().equals(password)){
                return true;
            }
        }
        return false;
    }
    @Override
    public User findUserByName(String userName) {
        List<User> users = userDao.findAll();
        for (User user:
                users) {
            if (user.getU_name().equals(userName)){
                return user;
            }
        }
        return null;
    }

}

