package com.libiao.service;

import com.libiao.pojo.User;

import java.util.List;

public interface UserService {

    boolean addUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(Integer id);
    User findUserById(Integer id);
    List<User> findAll();
    boolean check(String userName, String password);
}
