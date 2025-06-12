package com.Tokenconf.demo.service;

import com.Tokenconf.demo.entity.Post;
import com.Tokenconf.demo.repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {


    private final PostRepository postRepository;

    public List<Post> findAllPost() {
        return postRepository.findAll();
    }

    public Post searchPost(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public void savePost(Post post) {
        postRepository.save(post);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    @Transactional
    public void updatePost(Long id, String newcontent) {
        Post post = postRepository.findById(id).orElse(null);
        post.setContent(newcontent);
    }
}
