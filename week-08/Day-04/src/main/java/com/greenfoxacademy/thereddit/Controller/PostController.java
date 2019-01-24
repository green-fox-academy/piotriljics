package com.greenfoxacademy.thereddit.Controller;

import com.greenfoxacademy.thereddit.Model.Posts;
import com.greenfoxacademy.thereddit.Repository.PostRepository;
import com.greenfoxacademy.thereddit.Service.AssigneeService;
import com.greenfoxacademy.thereddit.Service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    private RedditService redditService;
    private AssigneeService assigneeService;

    @Autowired
    public PostController(RedditService redditService, AssigneeService assigneeService) {
        this.redditService = redditService;
        this.assigneeService = assigneeService;
    }

    @GetMapping("/")
    public String index(Model model, @RequestParam(defaultValue = "1") int page){
        model.addAttribute("posts", redditService.findAllPaged(page-1));
        return "index";
    }

    @GetMapping("/submit")
    public String getSubmit(Model model){
    model.addAttribute("post", new Posts());
    return "submit";
    }
    @PostMapping("/submit")
    public String addSubmit(@ModelAttribute(name="post") Posts posts){
        redditService.savePost(posts);
        return "redirect:/";
    }
    @GetMapping("/{id}/rateup")
    String rateUp(@PathVariable(value = "id") Long id){
      Posts post = redditService.findByPostId(id);
      post.setLikes(post.getLikes()+1);
      redditService.savePost(post);
      return "redirect:/";
    }
    @GetMapping("/{id}/ratedown")
    String rateDown(@PathVariable(value = "id") Long id){
        Posts post = redditService.findByPostId(id);
        post.setLikes(post.getLikes()-1);
        redditService.savePost(post);
        return "redirect:/";
    }
}
