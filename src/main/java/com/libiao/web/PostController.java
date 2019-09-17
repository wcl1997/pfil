package com.libiao.web;

import com.libiao.pojo.Post;
import com.libiao.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping("/about")
    public String about(HttpServletRequest request){
        List<Post> posts = postService.findAll();
        request.setAttribute("posts", posts);
        return "about";
    }

    /*@RequestMapping("/detail/${post.PId}")
    public String detail(){
        return "detail";
    }*/
}
