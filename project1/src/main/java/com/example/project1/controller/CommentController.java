package com.example.project1.controller;

import com.example.project1.entity.Comment;
import com.example.project1.service.CommentService;
import com.example.project1.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService commentService;
    private final PostService postService;

    public CommentController(CommentService commentService, PostService postService) {
        this.commentService = commentService;
        this.postService = postService;
    }

    @GetMapping("/post/{postId}")
    public List<Comment> getCommentsByPost(@PathVariable Long postId) {
        return commentService.getCommentsByPost(postService.getPostById(postId));
    }

    @PostMapping("/post/{postId}")
    public Comment addCommentToPost(@PathVariable Long postId, @RequestBody Comment comment) {
        comment.setPost(postService.getPostById(postId));
        return commentService.addComment(comment);
    }

    @DeleteMapping("/{commentId}")
    public void deleteComment(@PathVariable Long commentId) {
        commentService.deleteComment(commentId);
    }
}
