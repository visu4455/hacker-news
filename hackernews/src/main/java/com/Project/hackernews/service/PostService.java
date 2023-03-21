package com.Project.hackernews.service;


import com.Project.hackernews.Repo.PostRepo;
import com.Project.hackernews.entity.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
   private  PostRepo postRepo;



    public void   savePost(Posts post)
    {
        postRepo.save(post);
    }

    public List<Posts> getPostsData()
    {
        List<Posts>  postdata=postRepo.newPosts();
        return postdata;
    }

    public List<Posts>  getOldPosts()
    {
        List<Posts>  oldPostData=postRepo.OldPosts();
        return oldPostData;
    }




}
