package com.example.project1.service;

import com.example.project1.entity.Comment;
import com.example.project1.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void createComment(Long boardId, Long postId, String content, String password) {
        Comment comment = new Comment();
        comment.setPostId(postId);
        comment.setContent(content);
        comment.setPassword(password);
        // Add additional logic if needed (e.g., validation)
        commentRepository.save(comment);
    }

    public void deleteComment(Long commentId, String password) {
        // Add logic to check if the password matches before deleting the comment
        commentRepository.deleteById(commentId);
    }
}
