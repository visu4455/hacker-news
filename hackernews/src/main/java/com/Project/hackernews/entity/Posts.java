package com.Project.hackernews.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Posts {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long Id;

    private  String title;

    private String url;

    private  String text;

    public  Posts()
    {}

    public Posts(long id, String title, String url, String text) {
        Id = id;
        this.title = title;
        this.url = url;
        this.text = text;
    }
    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
