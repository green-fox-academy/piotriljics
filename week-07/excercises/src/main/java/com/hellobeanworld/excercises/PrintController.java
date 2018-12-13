package com.hellobeanworld.excercises;

import com.hellobeanworld.excercises.Models.MyColor;
import com.hellobeanworld.excercises.Models.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PrintController {
    String email;

    @Autowired
    Printer printer;

    @Autowired
    MyColor myColor;

    @Autowired
    UtilityService utilityService;

    @RequestMapping("/useful")
    public String useful(){
        return "useful";
    }

    @RequestMapping("/useful/colored")
    public String colored(Model model){
        model.addAttribute("randomColor", utilityService.randomColor());
        return "colored";
    }

    @RequestMapping("/useful/email")
    public String emailValidator(Model model, @RequestParam String email){
        model.addAttribute("valid", utilityService.emailValidator(email));
        model.addAttribute("email",email);
        return "email";
    }
}
