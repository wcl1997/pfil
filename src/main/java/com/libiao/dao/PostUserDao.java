package com.libiao.dao;

import com.libiao.pojo.PostUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostUserDao extends JpaRepository<PostUser,Long> {
    /*@Delete("delete from post_user where pu_id=#{puId}")
    void deletePostUserBypuId(Long puId);*/
    @Select("SELECT * FROM post_user where u_Id=#{uId}")
    List<PostUser> findByuId(Long uId);
    @Select("SELECT * FROM post_user where p_Id=#{pId}")
    List<PostUser> findBypId(Long pId);
}
