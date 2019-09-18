package com.libiao.dao;

import com.libiao.pojo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

@Mapper
public interface PostDao extends JpaRepository<Post, Integer> {
}
