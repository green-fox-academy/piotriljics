package com.greenfoxacademy.tourist.Controller;

import com.greenfoxacademy.tourist.Model.Attraction;
import com.greenfoxacademy.tourist.Repository.MyRepository;
import com.greenfoxacademy.tourist.Service.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AttractionController {
    AttractionService attractionService;

    @Autowired
    public AttractionController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    @GetMapping({"/", "/edit/{id}"})
    String listAttractions(Model model, @PathVariable (required=false) Long id) {
        if (id == null) {
        model.addAttribute("attractions", attractionService.listAllAttractions());
        return "index";
        } model.addAttribute("attractions", attractionService.listAllAttractions());
        model.addAttribute("attractionEdit", attractionService.findById(id));
        return "index";
    }

    @PostMapping("/add")
    String saveAttraction(@ModelAttribute Attraction attraction){
        attractionService.addAttraction(attraction);
        return "redirect:/";
    }

    @GetMapping("/edit2/{id}")
    String editAttraction(@PathVariable("id") Long id, Model model){
        model.addAttribute("editAttraction", attractionService.findById(id));
        return "edit";
    }

    @PostMapping("/edit/{id}")
    String editAttractionPost(@PathVariable("id") Long id, @ModelAttribute Attraction attraction){
        attraction.setId(id);
        attractionService.addAttraction(attraction);
        return "redirect:/";
    }

   @GetMapping("/budge")
   @ResponseBody
   List<Attraction> budgePost(){
        return attractionService.listCheapest();
    }

}
