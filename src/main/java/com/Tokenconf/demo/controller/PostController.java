package com.Tokenconf.demo.controller;

import com.Tokenconf.demo.entity.Post;
import com.Tokenconf.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/post/{id}")
    public Post openPost(@PathVariable Long id) {
        return postService.searchPost(id);
    }
}
