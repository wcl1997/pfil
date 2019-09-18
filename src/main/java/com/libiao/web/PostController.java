package com.libiao.web;

import com.libiao.pojo.Post;
import com.libiao.service.PostService;
import com.libiao.service.PostUserService;
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
        Post post = postService.findPostById(id.longValue());
        request.getSession().setAttribute("post", post);
        request.getSession().setAttribute("likeNum",postUserService.approveNum(post.getPId()));
        request.getSession().setAttribute("dislikeNum",postUserService.dislikeNum(post.getPId()));
        System.out.println(postUserService.dislikeNum(post.getPId())+""+postUserService.approveNum(post.getPId()));
        return "detail";
    }

    @RequestMapping("/addPost")
    public String addPost(){
        return "addPost";
    }

}
