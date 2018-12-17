package com.foxclub.foxclub.Controller;

import com.foxclub.foxclub.Service.QuokkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    QuokkaService quokkaService;

    @Autowired
    public MainController(QuokkaService quokkaService){
        this.quokkaService = quokkaService;
    }

    @GetMapping("/")
    public String showIndex(){
        return "index";
    }
    @GetMapping("/login")
    public String loginView(Model model, String name) {
        model.addAttribute("name", name);
        return "login";
    }
    @PostMapping("/login")
    public String loginInput(Model model, @RequestParam("name") String name) {
        model.addAttribute("name", name);
        quokkaService.add(name);
        return "redirect:/showQuokkas";
    }
    @GetMapping("/showQuokkas")
    public String list(Model model){
        model.addAttribute("quokkaList", quokkaService.getMyList());
        return "showQuokkas";
    }

}
