package com.example.project1.controller;

import com.example.project1.entity.Comment;
import com.example.project1.entity.Post;
import com.example.project1.service.CommentService;
import com.example.project1.service.PostService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;
    private final CommentService commentService;

    public PostController(PostService postService, CommentService commentService) {
        this.postService = postService;
        this.commentService = commentService;
    }

    @GetMapping("/{postId}")
    public Post getPost(@PathVariable Long postId) {
        return postService.getPostById(postId);
    }

    @PostMapping("/{postId}/comments")
    public Comment addComment(@PathVariable Long postId, @RequestBody Comment comment) {
        Post post = postService.getPostById(postId);
        comment.setPost(post);
        return commentService.addComment(comment);
    }
}
