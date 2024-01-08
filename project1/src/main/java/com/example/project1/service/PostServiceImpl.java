package com.example.project1.service;

import com.example.project1.entity.Post;
import com.example.project1.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getAllPosts() {
        return null;
    }

    @Override
    public Post getPostById(Long id) {
        return null;
    }

    @Override
    public Post createPost(Post post) {
        return null;
    }

    @Override
    public Post updatePost(Long id, Post updatedPost, String authorPassword) {
        return null;
    }

    @Override
    public void deletePost(Long id, String authorPassword) {

    }

    // 구현할 메서드들은 여기에 추가됩니다.
}
