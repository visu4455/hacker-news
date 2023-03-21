package com.Project.hackernews.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="users",uniqueConstraints=@UniqueConstraint(columnNames = "username"))
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private Date createdAt;
    private String password;

    public Users() {

    }
    public Users(String username, Date createdAt, String password) {
        this.username = username;
        this.createdAt = createdAt;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}