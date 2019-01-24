package com.greenfoxacademy.thereddit;

import com.greenfoxacademy.thereddit.Model.Assignee;
import com.greenfoxacademy.thereddit.Model.Posts;
import com.greenfoxacademy.thereddit.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheredditApplication implements CommandLineRunner {

    private PostRepository postRepository;
    @Autowired
    public TheredditApplication(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TheredditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Assignee bob = new Assignee();
        Assignee jack = new Assignee();
        Assignee omar = new Assignee();
        Assignee cecilia = new Assignee();
        postRepository.save(new Posts("cook1", "cooking is good", 100,bob));
        postRepository.save(new Posts("cook", "cooking is good", 90, cecilia));
        postRepository.save(new Posts("party", "today I will have a good party", 80,jack));
        postRepository.save(new Posts("party", "today I will have a good party", 70,cecilia));
        postRepository.save(new Posts("party", "today I will have a good party", 60,jack));
        postRepository.save(new Posts("cook", "cooking is good", 50, omar));
        postRepository.save(new Posts("cook", "cooking is good", 40, bob));
        postRepository.save(new Posts("party", "today I will have a good party", 30,omar));
        postRepository.save(new Posts("party", "today I will have a good party", 20, cecilia));
        postRepository.save(new Posts("party", "today I will have a good party", 10, omar));
        postRepository.save(new Posts("cook2", "cooking is good", 92, jack));
        postRepository.save(new Posts("cook", "cooking is good", 93, jack));
        postRepository.save(new Posts("party", "today I will have a good party", 77, cecilia));
        postRepository.save(new Posts("party", "today I will have a good party", 21, omar));
        postRepository.save(new Posts("party", "today I will have a good party", 22, cecilia));
        postRepository.save(new Posts("cook", "cooking is good", 11, cecilia));
        postRepository.save(new Posts("cook", "cooking is good", 16, jack));
        postRepository.save(new Posts("party", "today I will have a good party", 92, bob));
    }
}

