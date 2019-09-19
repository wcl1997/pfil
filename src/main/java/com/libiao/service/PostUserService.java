package com.libiao.service;

import com.libiao.pojo.Post;
import com.libiao.pojo.PostUser;

import java.util.List;

public interface PostUserService {
    boolean addPostUserApprove(PostUser postUser);

    boolean addPostUserDislike(PostUser postUser);

    boolean updatePostUser(PostUser postUser);
    boolean deletePostUser(Long id);
    PostUser findPostUserById(Long id);
    List<PostUser> findAll();

    List<PostUser> findByUser(Long uId);

    boolean checkApprove(Long uId, Long pId);

    boolean checkDislike(Long uId, Long pId);

    int approveNum(Long pId);

    int dislikeNum(Long pId);
}
