package com.libiao.controller;

import com.libiao.pojo.Post;
import com.libiao.service.PostService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class PhotoController {
    @Autowired
    private PostService postService;

    @RequestMapping(value = "upload")
    public ModelAndView upload(@RequestParam(value = "pImg") MultipartFile file, HttpServletRequest request) throws ParseException {
        ModelAndView modelAndView = new ModelAndView();
        if (file.isEmpty()) {
            System.out.println("文件为空");
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String filePath = "D:\\WorkSpace\\pfil\\src\\main\\resources\\static\\post_img\\"; // 上传后的路径
        //fileName = UUID.randomUUID() + suffixName; // 存库的时候使用
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        modelAndView.addObject("filename","jsp/pic/"+fileName);
        Post post = new Post();
        String pTitle = (String)request.getParameter("pTitle");
        String pContent = (String)request.getParameter("pContent");
        post.setPImg(fileName);
        post.setPTitle(pTitle);
        post.setPContent(pContent);
        //时间
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss ");
        String time = sdf.format(d);
        Date date = sdf.parse(time);
        post.setPTime(date);
//        System.out.println(post);
        postService.addPost(post);
        modelAndView.setViewName("/about");
        return modelAndView;
    }
}
