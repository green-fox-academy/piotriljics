package com.greenfoxacademy.thereddit.Service;

import com.greenfoxacademy.thereddit.Model.Posts;
import com.greenfoxacademy.thereddit.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.lang.ref.Reference;
import java.util.List;

@Service
public class RedditService {
    PostRepository postRepository;

    @Autowired
    public RedditService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Posts> listAll() {
        return postRepository.findAll();
    }

    public void savePost(Posts posts) {
        postRepository.save(posts);
    }

    public Posts findByPostId(Long id) {
        return postRepository.findById(id).get();
    }
    public Page<Posts> findAllPaged(int page) {
        return postRepository.findAll(PageRequest.of(page, 10, Sort.by("likes").descending()));
    }
}
