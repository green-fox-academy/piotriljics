package com.greenfoxacademy.thereddit.Repository;

import com.greenfoxacademy.thereddit.Model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Posts, Long> {
}
