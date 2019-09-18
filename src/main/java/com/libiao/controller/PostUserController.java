package com.libiao.controller;

import com.libiao.pojo.Post;
import com.libiao.pojo.PostUser;
import com.libiao.pojo.User;
import com.libiao.service.PostUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PostUserController {
    @Autowired
    PostUserService postUserService;
    @RequestMapping(value = "/approve",method = RequestMethod.POST)
    public String userApprove(HttpServletRequest request){
        User user=(User)request.getSession().getAttribute("user");
        Post post=(Post)request.getSession().getAttribute("post");
        PostUser postUser=new PostUser();
        postUserService.checkDislike(user.getU_id().longValue(),post.getPId().longValue());//查看是否已经点过踩，如果点过将取消踩

        if(postUserService.checkApprove(user.getU_id().longValue(),post.getPId().longValue())){
            return "Cancel Like";//查看是否已经点过赞，如果点过将取消赞
        }else{
            postUser.setPId(post.getPId().longValue());
            postUser.setUId(user.getU_id().longValue());
            postUserService.addPostUserApprove(postUser);
            return "Like";
        }
    }
    @RequestMapping(value = "/dislike",method = RequestMethod.POST)
    public String userDislike(HttpServletRequest request){
        User user=(User)request.getSession().getAttribute("user");
        Post post=(Post)request.getSession().getAttribute("post");
        PostUser postUser=new PostUser();
        postUserService.checkApprove(user.getU_id().longValue(),post.getPId().longValue());//查看是否已经点过赞，如果点过将取消赞

        if(postUserService.checkDislike(user.getU_id().longValue(),post.getPId().longValue())){
            return "Cancel dislike";//查看是否已经点过踩，如果点过将取消踩
        }else{
            postUser.setPId(post.getPId().longValue());
            postUser.setUId(user.getU_id().longValue());
            postUserService.addPostUserDislike(postUser);
            return "dislike";
        }
    }
}
