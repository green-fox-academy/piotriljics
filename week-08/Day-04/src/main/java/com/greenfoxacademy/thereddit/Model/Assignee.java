package com.greenfoxacademy.thereddit.Model;

import org.hibernate.engine.profile.Fetch;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;

    @OneToMany (fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    List<Posts> postsList = new ArrayList<>();

    public Assignee() {
    }
    public Assignee(String username) {
        this.username = username;
    }

    public Assignee(String username, List<Posts> postsList) {
        this.username = username;
        this.postsList = postsList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Posts> getPostsList() {
        return postsList;
    }

    public void setPostsList(List<Posts> postsList) {
        this.postsList = postsList;
    }
}
