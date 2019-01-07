package com.greenfoxacademy.thereddit.Model;

import javax.persistence.*;

@Entity
@Table
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "content")
    private String content;
    @Column
    private String title;
    @Column
    private Integer likes;

    public Posts(String content, String title) {
        this.content = content;
        this.title = title;
        this.likes = 0;
    }

    public Posts() {
        this.likes = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
