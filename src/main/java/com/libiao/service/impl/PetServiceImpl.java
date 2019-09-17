package com.libiao.service.impl;

import com.libiao.dao.PetDao;
import com.libiao.pojo.Pet;
import com.libiao.pojo.Post;
import com.libiao.pojo.User;
import com.libiao.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class PetServiceImpl implements PetService {
    @Autowired
    PetDao petDao;

    @Override
    public boolean addPet(Pet pet) {
        boolean flag = false;
        try {
            petDao.save(pet);
            flag = true;
        } catch (Exception e){
            System.out.println("新增宠物失败！");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updatePost(Pet pet) {
        boolean flag=false;
        try{
            petDao.save(pet);
            flag=true;
        }catch(Exception e){
            System.out.println("修改宠物信息失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deletePet(Long id) {
        boolean flag=false;
        try{
            petDao.delete(id);
            flag=true;
        }catch(Exception e){
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Pet findPetById(Long id) {
        return petDao.findOne(id);
    }

    @Override
    public List<Pet> findAll() {
        return petDao.findAll();
    }
    /*@Override
    public List<Pet> findPetByUser(int userId){
        List<Pet> allPets=petDao.findAll();
        List<Pet> pets=null;
        int petNum=0;
        *//*User user=(User)request.getSession().getAttribute("user");*//*
        *//*int userId=user.getU_id();*//*
        for(Pet pet:allPets){
            if(pet.getUId()==userId){
                System.out.println(pet);
                pets.add(pet);
                petNum++;
            }
        }
        System.out.println(userId+": "+petNum);
        return pets;
    }*/
    @Override
    public List<Pet> findPetByUserId(Long userId){
        System.out.println(petDao.findByuId(userId));
        return petDao.findByuId(userId);
    }
}
