package com.example.mobile.controller;

import com.example.mobile.model.PetrolPerDistance;
import com.example.mobile.service.PetrolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PetrolController {

    @Autowired
    private PetrolService petrolService;

    @GetMapping("/petrol")
    public String petrol(){
        return "petrol";
    }

    @PostMapping("/calculate")
    public String calculate (@ModelAttribute PetrolPerDistance p, Model model){

        double total = petrolService.getPrice(p.getDistance(),
                p.getPetrolLitrePer100km(),p.getPetrolPrice());

        model.addAttribute("total" ,total);
        return "price";
    }
}
