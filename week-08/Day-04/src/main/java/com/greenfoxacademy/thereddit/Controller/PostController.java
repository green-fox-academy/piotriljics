package com.greenfoxacademy.thereddit.Controller;

import com.greenfoxacademy.thereddit.Model.Posts;
import com.greenfoxacademy.thereddit.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {
    private PostRepository postRepository;

    @Autowired
    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("posts", postRepository.findAll());
        return "index";
    }

    @GetMapping("/submit")
    public String getSubmit(Model model, @ModelAttribute(name="post") Posts posts){
    model.addAttribute("post", posts);
    return "submit";
    }
    @PostMapping("/submit")
    public String addSubmit(@ModelAttribute(name="post") Posts posts){
        postRepository.save(posts);
        return "redirect:/";
    }

}
