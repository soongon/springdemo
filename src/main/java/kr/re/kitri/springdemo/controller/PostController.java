package kr.re.kitri.springdemo.controller;

import kr.re.kitri.springdemo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // 전체 글보기 GET: /posts --> 전체 글(JSON)
    @GetMapping("/posts")
    public String viewAllPosts() {
        return postService.getAllPosts();
    }

    // 3번 글 상세 글보기 GET: /posts/3 --> 3번 글 상세보기
    @GetMapping("/posts/3")
    public String viewDetail() {
        return postService.getPostNumber3();
    }
}
