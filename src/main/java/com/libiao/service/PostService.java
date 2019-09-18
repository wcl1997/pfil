package com.libiao.service;

import com.libiao.pojo.Post;

import java.util.List;

public interface PostService {
    boolean addPost(Post post);
    boolean updatePost(Post post);
    boolean deletePost(Integer id);
    Post findPostById(Integer id);
    List<Post> findAll();
}
