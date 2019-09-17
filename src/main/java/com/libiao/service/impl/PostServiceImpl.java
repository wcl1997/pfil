package com.libiao.service.impl;

import com.libiao.dao.PostDao;
import com.libiao.pojo.Post;
import com.libiao.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostDao postDao;

    @Override
    public boolean addPost(Post post) {
        boolean flag = false;
        try {
            postDao.save(post);
            flag = true;
        } catch (Exception e){
            System.out.println("新增失败！");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updatePost(Post post) {
        boolean flag=false;
        try{
            postDao.save(post);
            flag=true;
        }catch(Exception e){
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deletePost(Long id) {
        boolean flag=false;
        try{
            postDao.delete(id);
            flag=true;
        }catch(Exception e){
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Post findPostById(Long id) {
        return postDao.findOne(id);
    }

    @Override
    public List<Post> findAll() {
        return postDao.findAll();
    }
}
