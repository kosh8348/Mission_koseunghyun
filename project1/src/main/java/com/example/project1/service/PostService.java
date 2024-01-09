package com.example.project1.service;

import com.example.project1.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post getPostById(Long id);
    Post createPost(Post post, Long boardId, String authorPassword);
    Post updatePost(Long id, Post updatedPost, String authorPassword);
    void deletePost(Long id, String authorPassword);
}
