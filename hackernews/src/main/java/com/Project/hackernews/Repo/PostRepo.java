package com.Project.hackernews.Repo;

import com.Project.hackernews.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostRepo extends JpaRepository<Posts,Long> {

    @Query("SELECT p FROM Posts p ORDER BY ASC")
    List<Posts>   newPosts();

    @Query("SELECT p FROM Posts p ODER By DESC")
    List<Posts>  OldPosts();
}
