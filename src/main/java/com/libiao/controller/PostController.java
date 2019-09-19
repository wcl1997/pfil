package com.libiao.controller;

import com.libiao.pojo.Post;
import com.libiao.service.PostService;
import com.libiao.service.PostUserService;
import org.omg.PortableInterceptor.RequestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class PostController {
    @Autowired
    private PostService postService;
    @Autowired
    private PostUserService postUserService;

    @RequestMapping("/about")
    public String about(HttpServletRequest request){
        List<Post> posts = postService.findAll();
        request.setAttribute("posts", posts);
        return "about";
    }

    @RequestMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, HttpServletRequest request){
        Post post = postService.findPostById(id);
        request.getSession().setAttribute("post", post);
        String likeNum=String.valueOf(postUserService.approveNum(id.longValue()));
        String dislikeNum=String.valueOf(postUserService.dislikeNum(id.longValue()));
        request.getSession().setAttribute("likeNum",likeNum);
        request.getSession().setAttribute("dislikeNum",dislikeNum);
        return "detail";
    }

    @RequestMapping("/addPost")
    public String addPost(){
        return "addPost";
    }

}
