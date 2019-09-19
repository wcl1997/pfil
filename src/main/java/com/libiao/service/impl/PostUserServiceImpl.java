package com.libiao.service.impl;

import com.libiao.dao.PostUserDao;
import com.libiao.pojo.Post;
import com.libiao.pojo.PostUser;
import com.libiao.service.PostUserService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostUserServiceImpl implements PostUserService {
    @Autowired
    PostUserDao postUserDao;

    @Override
    public boolean addPostUserApprove(PostUser postUser) {
        boolean flag = false;
        postUser.setPustate("点赞");
        try {
            postUserDao.save(postUser);
            flag = true;
        } catch (Exception e){
            System.out.println("新增失败！");
            e.printStackTrace();
        }
        return flag;
    }
    @Override
    public boolean addPostUserDislike(PostUser postUser) {
        boolean flag = false;
        postUser.setPustate("踩");
        try {
            postUserDao.save(postUser);
            flag = true;
        } catch (Exception e){
            System.out.println("新增失败！");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updatePostUser(PostUser postUser) {
        boolean flag=false;
        try{
            postUserDao.save(postUser);
            flag=true;
        }catch(Exception e){
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deletePostUser(Long id) {
        boolean flag=false;
        try{
            postUserDao.delete(id);
            flag=true;
        }catch(Exception e){
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public PostUser findPostUserById(Long id) {
        return postUserDao.findOne(id);
    }

    @Override
    public List<PostUser> findAll() {
        return postUserDao.findAll();
    }

    @Override
    public List<PostUser> findByUser(Long uId){
        return postUserDao.findByuId(uId);
    }
    @Override
    public boolean checkApprove(Long uId, Long pId){
        boolean flag=false;
        List<PostUser> postUsers=postUserDao.findByuId(uId);
        for(PostUser postUser:postUsers){
            if(postUser.getPustate().equals("点赞")&&postUser.getPId().equals(pId)){
                System.out.println(uId+"已经为帖子点过赞了，将为帖子取消点赞");
                postUserDao.delete(postUser.getPuId());
                return true;
            }
        }
        return flag;
    }
    @Override
    public boolean checkDislike(Long uId, Long pId){
        boolean flag=false;
        List<PostUser> postUsers=postUserDao.findByuId(uId);
        for(PostUser postUser:postUsers){
            if(postUser.getPustate().equals("踩")&&postUser.getPId().equals(pId)){
                System.out.println(uId+"已经为帖子点过踩了,将为帖子取消踩");
                postUserDao.delete(postUser.getPuId());
                return true;
            }
        }
        return flag;
    }
    @Override
    public int approveNum(Long pId){
        int approveNum=0;
        List<PostUser> postUsers=postUserDao.findBypId(pId);
        for(PostUser postUser:postUsers){
            if(postUser.getPustate().equals("点赞")){
                approveNum++;
                System.out.println(approveNum);
            }
        }
        return approveNum;
    }
    @Override
    public int dislikeNum(Long pId){
        int dislikeNum=0;
        List<PostUser> postUsers=postUserDao.findBypId(pId);
        for(PostUser postUser:postUsers){
            if(postUser.getPustate().equals("踩")){
                dislikeNum++;
                System.out.println(dislikeNum);
            }
        }
        return dislikeNum;
    }
}
