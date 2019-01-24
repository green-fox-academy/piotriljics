package com.greenfoxacademy.exampractice.Controller;

import com.greenfoxacademy.exampractice.Model.Url;
import com.greenfoxacademy.exampractice.Service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class MainController {
    UrlService urlService;

    @Autowired
    public MainController(UrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping({"/", ""})
    public String showPage(Model model, @ModelAttribute("url") Url url,
                           @ModelAttribute("error") String error,
                           @ModelAttribute("message") String message) {
        model.addAttribute("url", url);
        model.addAttribute("error", error);
        model.addAttribute("message", message);
        return "index";
    }

    @PostMapping("/save-link")
    public String saveLink(RedirectAttributes attributes, @ModelAttribute(value = "url") @Valid Url url, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            attributes.addFlashAttribute("err", "Whoooops");
            return "redirect:/";
        } else if (urlService.isIdUsed(url.getInputAlias())) {
            attributes.addFlashAttribute("error", "Your alias is already in use!");
            attributes.addFlashAttribute("url", url);
            return "redirect:/";
        } else {
            url.setSecretCode((int) (Math.random() * 10) + "" + (int) (Math.random() * 10) + "" + (int) (Math.random() * 10) + "" + (int) (Math.random() * 10));
            urlService.newLink(url);
            attributes.addFlashAttribute("message", "Your URL is aliased to " + url.getInputAlias() + " and your secret code is " + url.getSecretCode() + ".");
            return "redirect:/";
        }
    }
        @GetMapping("a/{alias}")
        public String hitCount (@PathVariable String alias){
        if (urlService.isIdUsed(alias)) {
            urlService.increaseHitCount(alias);
            urlService.newLink(urlService.findByInputAlias(alias));
            return "redirect:" + urlService.findByInputAlias(alias).getInput();
        } return "404";
    }

}
