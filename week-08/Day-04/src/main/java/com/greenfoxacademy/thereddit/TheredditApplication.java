package com.greenfoxacademy.thereddit;

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
        postRepository.save(new Posts("yes", "no"));
        postRepository.save(new Posts("bob", "dog"));
        postRepository.save(new Posts("pipe", "die"));
    }
}

