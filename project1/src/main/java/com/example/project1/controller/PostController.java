package com.example.project1.controller;

import com.example.project1.entity.Post;
import com.example.project1.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boards/{boardId}/article")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/{articleId}")
    public ResponseEntity<Post> getPostById(@PathVariable Long articleId) {
        Post post = postService.getPostById(articleId);
        return ResponseEntity.ok().body(post);
    }

    @PostMapping("/")
    public ResponseEntity<Post> createPost(@RequestBody Post post, @PathVariable Long boardId, @RequestParam String authorPassword) {
        Post createdPost = postService.createPost(post, boardId, authorPassword);
        return ResponseEntity.ok().body(createdPost);
    }

    @PutMapping("/{articleId}")
    public ResponseEntity<Post> updatePost(@PathVariable Long articleId, @RequestBody Post updatedPost, @RequestParam String authorPassword) {
        Post post = postService.updatePost(articleId, updatedPost, authorPassword);
        return ResponseEntity.ok().body(post);
    }

    @DeleteMapping("/{articleId}")
    public ResponseEntity<?> deletePost(@PathVariable Long articleId, @RequestParam String authorPassword) {
        postService.deletePost(articleId, authorPassword);
        return ResponseEntity.ok().build();
    }
}
