package com.libiao.controller;

import com.libiao.pojo.Pet;
import com.libiao.pojo.User;
import com.libiao.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class PetController {
    @Autowired
    PetService petService;

    @RequestMapping(value = "/findUserPets")
    public List<Pet> findUserPets(HttpServletRequest request){
        User user=(User)request.getSession().getAttribute("user");
        List<Pet> pets = petService.findPetByUserId(user.getU_id().longValue());
        request.setAttribute("pets", pets);
        return pets;
    }

    @RequestMapping(value = "/addUserPet")
    public void addPet(HttpServletRequest request, HttpServletResponse response, Pet pet) throws IOException {
        User user=(User)request.getSession().getAttribute("user");
        pet.setUId(user.getU_id().longValue());
        if(petService.addPet(pet)){
            response.getOutputStream().write("true".getBytes("utf-8"));
//            return "Success";
        } else {
            response.getOutputStream().write("false".getBytes("utf-8"));
        }
//        return "error";
    }

    @RequestMapping(value="/delPet")
    public String delPet(Long petId){
        if(petService.deletePet(petId)){
            return "Success";
        }
        return "error";
    }

    @RequestMapping(value = "updatePet")
    public String updatePet(HttpServletRequest request,Pet pet){
        User user=(User)request.getSession().getAttribute("user");
        pet.setUId(user.getU_id().longValue());
        if(petService.updatePost(pet)){
            return "Success";
        }
        return "error";
    }

    @RequestMapping(value = "addPet")
    public String addPet(){
        return "addPet";
    }
}
