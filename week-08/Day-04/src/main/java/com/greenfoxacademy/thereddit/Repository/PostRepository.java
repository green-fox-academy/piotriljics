package com.greenfoxacademy.thereddit.Repository;

import com.greenfoxacademy.thereddit.Model.Posts;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Posts, Long> {
}
