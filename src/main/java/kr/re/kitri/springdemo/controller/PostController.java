package kr.re.kitri.springdemo.controller;

import kr.re.kitri.springdemo.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    // 전체 글보기 GET: /posts --> 전체 글(JSON)
    @GetMapping("/posts")
    public String viewAllPosts() {

        PostService postService = new PostService();
        return postService.getAllPosts();
    }
}
