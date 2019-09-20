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
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class PostUserController {
    @Autowired
    PostUserService postUserService;
    @RequestMapping(value = "/approve",method = RequestMethod.GET)
    public void userApprove(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User user=(User)request.getSession().getAttribute("user");
        Post post=(Post)request.getSession().getAttribute("post");
        PostUser postUser=new PostUser();
        postUserService.checkDislike(user.getU_id().longValue(),post.getPId().longValue());//查看是否已经点过踩，如果点过将取消踩
        int liNum=postUserService.approveNum(post.getPId().longValue());
        if(postUserService.checkApprove(user.getU_id().longValue(),post.getPId().longValue())){
            liNum--;
            String likeNum=String.valueOf(liNum) + ";";
            String dislikeNum=String.valueOf(postUserService.dislikeNum(post.getPId().longValue()));
            response.getOutputStream().write(likeNum.getBytes("utf-8"));
            response.getOutputStream().write(dislikeNum.getBytes("utf-8"));
//            return s;//查看是否已经点过赞，如果点过将取消赞
        }else{
            postUser.setPId(post.getPId().longValue());
            postUser.setUId(user.getU_id().longValue());
            postUserService.addPostUserApprove(postUser);
            liNum++;
            String likeNum=String.valueOf(liNum) + ";";
            response.getOutputStream().write(likeNum.getBytes("utf-8"));
            String dislikeNum=String.valueOf(postUserService.dislikeNum(post.getPId().longValue()));
            response.getOutputStream().write(dislikeNum.getBytes("utf-8"));
//            return s;
//            System.out.println(likeNum);
        }
    }
    @RequestMapping(value = "/dislike",method = RequestMethod.GET)
    public void userDislike(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User user=(User)request.getSession().getAttribute("user");
        Post post=(Post)request.getSession().getAttribute("post");
        PostUser postUser=new PostUser();
        int disNum=postUserService.dislikeNum(post.getPId().longValue());

        postUserService.checkApprove(user.getU_id().longValue(),post.getPId().longValue());//查看是否已经点过赞，如果点过将取消赞

        if(postUserService.checkDislike(user.getU_id().longValue(),post.getPId().longValue())){
//            return dislikeNum;//查看是否已经点过踩，如果点过将取消踩
            disNum--;
            String dislikeNum=String.valueOf(disNum);
            String likeNum=String.valueOf(postUserService.approveNum(post.getPId().longValue())) + ";";
            response.getOutputStream().write(likeNum.getBytes("utf-8"));
            response.getOutputStream().write(dislikeNum.getBytes("utf-8"));
        }else{
            postUser.setPId(post.getPId().longValue());
            postUser.setUId(user.getU_id().longValue());
            postUserService.addPostUserDislike(postUser);
            disNum++;
            String dislikeNum=String.valueOf(disNum);
            String likeNum=String.valueOf(postUserService.approveNum(post.getPId().longValue())) + ";";
            response.getOutputStream().write(likeNum.getBytes("utf-8"));
            response.getOutputStream().write(dislikeNum.getBytes("utf-8"));
//            return dislikeNum;
        }
    }
}
