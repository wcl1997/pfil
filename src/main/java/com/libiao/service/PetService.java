package com.libiao.service;

import com.libiao.pojo.Pet;
import com.libiao.pojo.Post;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface PetService {
    boolean addPet(Pet pet);

    boolean updatePost(Pet pet);

    boolean deletePet(Long id);

    Pet findPetById(Long id);

    List<Pet> findAll();

 /*   List<Pet> findPetByUser(int userId);*/
    List<Pet> findPetByUserId(Long userId);
}
