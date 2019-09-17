package com.libiao.service;

import com.libiao.pojo.Admin;

public interface AdminService {
    boolean deletePost(Long id);
    boolean deleteUser(Integer id);

    boolean check(String adminName, String password);

    Admin findAdminByName(String adminName);

    boolean postDelLog(Long adminId, Long postId);

    boolean userDelLog(Long adminId, Long userId);
}
