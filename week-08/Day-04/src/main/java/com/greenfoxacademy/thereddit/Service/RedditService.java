package com.greenfoxacademy.thereddit.Service;

import com.greenfoxacademy.thereddit.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedditService {
    PostRepository postRepository;

    @Autowired
    public RedditService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

}
