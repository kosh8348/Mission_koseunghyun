package com.example.project1.service;

import com.example.project1.entity.Comment;
import com.example.project1.repository.CommentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public Comment getCommentById(Long id) {
        return commentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Comment not found with id: " + id));
    }

    @Override
    public Comment createComment(Comment comment) {
        // Implement logic to create a comment
        return commentRepository.save(comment);
    }

    @Override
    public Comment updateComment(Long id, Comment updatedComment) {
        // Implement logic to update a comment
        return commentRepository.save(updatedComment);
    }

    @Override
    public void deleteComment(Long id) {
        // Implement logic to delete a comment
        commentRepository.deleteById(id);
    }
}
