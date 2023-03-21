package com.Project.hackernews.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long Id;
    private  String title;
    private String url;
    private  String text;
    private boolean showHn;
    private boolean askHn;
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private final List<Comments> commentsList = new ArrayList<Comments>();

    public Posts()
    {}

    public Posts(String title, String url, String text, boolean showHn, boolean askHn) {
        this.title = title;
        this.url = url;
        this.text = text;
        this.showHn = showHn;
        this.askHn = askHn;
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

    public boolean isShowHn() {
        return showHn;
    }

    public void setShowHn(boolean showHn) {
        this.showHn = showHn;
    }

    public boolean isAskHn() {
        return askHn;
    }

    public void setAskHn(boolean askHn) {
        this.askHn = askHn;
    }

    public List<Comments> getCommentsList() {
        return commentsList;
    }
}