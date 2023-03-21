package com.Project.hackernews.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Show {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
     String title;
     String url;
     String text;

     public Show() {
     }

     public Show(int id, String title, String url, String text) {
          this.id = id;
          this.title = title;
          this.url = url;
          this.text = text;
     }

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
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
