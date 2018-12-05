package com.greenfoxacademy.springstart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloDiffLanguages {


        @RequestMapping("/web/greetall")
        public String greeting(Model model) {
            Greeting greeting = new Greeting();
            model.addAttribute("greet", greeting.randomHello());
            model.addAttribute("fontSize", greeting.randomNumber() + "px");
            model.addAttribute("randomColor", greeting.randomNumber());
            model.addAttribute("randomColor1", greeting.randomNumber());
            model.addAttribute("randomColor2", greeting.randomNumber());
            return "greetAll";
        }
}

