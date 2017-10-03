package com.theironyard.charlotte.candyjar.controllers;


import com.theironyard.charlotte.candyjar.models.Candy;

import com.theironyard.charlotte.candyjar.repositories.CandyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CandyJarController {

    @Autowired
    CandyRepository candiesRepo;

    @GetMapping("/")
//    GetMapping("/") is identical to the annotation below
//    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String homePage(Model model) {
        model.addAttribute("candies", candiesRepo.findAll());
        return "index";
    }

    @PostMapping("/add-candy")
    public String addCandy(Candy candies) {
        candiesRepo.save(candies);
        return "redirect:/";
    }

    // post route / delete mapping("/delete-candy")
    @PostMapping("/delete-candy")
    public String deleteCandy( int candyId) {
        candiesRepo.delete(candyId);
          return "redirect:/";
    }

//    @PostMapping("/update-candy")
//    public String updateCandy(Candy candies) {
//        candiesRepo.update
//                (candies);
//        return "redirect:/";
//    }


    //post route / update candy
}
