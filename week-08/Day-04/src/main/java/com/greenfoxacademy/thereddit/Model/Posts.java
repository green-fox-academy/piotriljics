package com.greenfoxacademy.thereddit.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;
    private String title;
    private Integer likes;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    Assignee assignee;

    public Posts() {
        this.likes = 0;
        date = new Date();
    }

    public Posts(String content, String title) {
        this.content = content;
        this.title = title;
        this.likes = 0;
        date = new Date();
    }

    public Posts(String content, String title, int likes, Assignee assignee) {
            this.content = content;
            this.title = title;
            this.likes = likes;
            this.assignee = assignee;
        date = new Date();
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }
}
