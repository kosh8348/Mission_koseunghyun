package com.example.project1.service;

import com.example.project1.entity.Comment;
import com.example.project1.entity.Post;
import com.example.project1.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> getCommentsByPost(Post post) {
        return commentRepository.findByPost(post);
    }

    public Comment addComment(Comment comment) {
        return comment;
    }

    public void deleteComment(Long commentId) {
    }
}
