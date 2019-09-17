package com.libiao.dao;

import com.libiao.pojo.Pet;
import com.libiao.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Mapper
public interface PetDao extends JpaRepository<Pet, Long> {
    @Select("SELECT * FROM pet where u_id=#{userId}")
    List<Pet> findByuId(Long userId);
}