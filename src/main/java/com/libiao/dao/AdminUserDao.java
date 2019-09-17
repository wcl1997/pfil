package com.libiao.dao;

import com.libiao.pojo.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminUserDao extends JpaRepository<AdminUser,Long> {
}
