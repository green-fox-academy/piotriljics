package com.foxclub.foxclub.Controller;

import com.foxclub.foxclub.Model.Nutrition;
import com.foxclub.foxclub.Model.Quokka;
import com.foxclub.foxclub.Repository.QuokkaRepository;
import com.foxclub.foxclub.Service.QuokkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
    QuokkaService quokkaService;
    QuokkaRepository quokkaRepository;

    @Autowired
    public MainController(QuokkaService quokkaService, QuokkaRepository quokkaRepository){
        this.quokkaService = quokkaService;
        this.quokkaRepository = quokkaRepository;
    }

    @GetMapping("/")
    public String showIndex(@RequestParam(name = "name", required = false) String name, Model model){
        if (name == null) {
            return "redirect:/login";
        } else {
            model.addAttribute("name", quokkaRepository.findByName(name));
            return "index";
        }
    }

    @GetMapping("/login")
    public String loginView(Model model, String name) {
        model.addAttribute("name", name);
        return "login";
    }
    @PostMapping("/login")
    public String loginInput(@RequestParam("name") String name, RedirectAttributes redirectAttributes) {
        quokkaService.saveQuokka(new Quokka(name));
        redirectAttributes.addAttribute("name", name);
        return "redirect:/";
    }

    @GetMapping("/nutritionstore")
    public String nutritions(Model model){
        model.addAttribute("foodlist", Nutrition.feed());
        model.addAttribute("drinklist",Nutrition.drink());
        return "nutritionstore";
    }
    @PostMapping("/nutritionstore")
    public String nutritionsInput(@RequestParam("name") String name, RedirectAttributes redirectAttributes) {
        quokkaService.saveQuokka(new Quokka(name));
        redirectAttributes.addAttribute("name", name);
        return "redirect:/";
    }
    /*@GetMapping("/showQuokkas")
    public String list(Model model){
        model.addAttribute("quokkaList", quokkaService.getMyList());
        return "showQuokkas";
    }*/

}
