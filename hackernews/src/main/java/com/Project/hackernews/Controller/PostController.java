package com.Project.hackernews.Controller;
import com.Project.hackernews.entity.Posts;
import com.Project.hackernews.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    PostService postService;


    @RequestMapping("/savePost")
    public String  savePosts(@ModelAttribute Posts posts)
    {
        postService.savePost(posts);

        return "redirect:/getPost";
    }

    @RequestMapping("/getPost")
    public String getData(Model model)
    {
        List<Posts> postsList=postService.getPostsData();
        model.addAttribute("allPosts",postsList);
        return "";
    }

    @RequestMapping("/pastPosts")
    public String geePastPosts(Model model)
    {

       List<Posts>  oldPostData=postService.getOldPosts();
       model.addAttribute("oldPostsData",oldPostData);
       return "";
    }


}
