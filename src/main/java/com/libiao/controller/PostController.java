package com.libiao.controller;

import com.libiao.pojo.Post;
import com.libiao.service.PostService;
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

    @RequestMapping("/about")
    public String about(HttpServletRequest request){
        List<Post> posts = postService.findAll();
        request.setAttribute("posts", posts);
        return "about";
    }

    @RequestMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, HttpServletRequest request){
        Post post = postService.findPostById(id);
        request.setAttribute("post", post);
        return "detail";
    }

    @RequestMapping("/addPost")
    public String addPost(){
        return "addPost";
    }

   /* @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) throws Exception {
        File saveFile = new File("D:");
        FileOutputStream outputStream = new FileOutputStream(saveFile);
        IOUtils.copy(file.getInputStream(), outputStream);
        return "test";
    }*/
}
