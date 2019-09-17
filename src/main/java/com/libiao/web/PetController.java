package com.libiao.web;

import com.libiao.pojo.Pet;
import com.libiao.pojo.User;
import com.libiao.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class PetController {
    @Autowired
    PetService petService;

    @RequestMapping(value = "/findUserPets",method = RequestMethod.GET)
    public List<Pet> findUserPets(HttpServletRequest request){
        User user=(User)request.getSession().getAttribute("user");
        List<Pet> pets = petService.findPetByUserId(user.getU_id().longValue());
        request.setAttribute("pets", pets);
        return pets;
    }

    @RequestMapping(value = "/addPet",method = RequestMethod.POST)
    public String addPet(HttpServletRequest request, @RequestBody Pet pet){
        User user=(User)request.getSession().getAttribute("user");
        pet.setUId(user.getU_id().longValue());
        if(petService.addPet(pet)){
            return "Success";
        }
        return "error";
    }

    @RequestMapping(value="/delPet",method = RequestMethod.POST)
    public String delPet(@RequestBody Long petId){
        if(petService.deletePet(petId)){
            return "Success";
        }
        return "error";
    }

    @RequestMapping(value = "updatePet",method = RequestMethod.PUT)
    public String updatePet(HttpServletRequest request,@RequestBody Pet pet){
        User user=(User)request.getSession().getAttribute("user");
        pet.setUId(user.getU_id().longValue());
        if(petService.updatePost(pet)){
            return "Success";
        }
        return "error";
    }
}
