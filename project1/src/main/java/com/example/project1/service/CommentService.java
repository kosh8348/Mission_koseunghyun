package com.example.project1.service;

import com.example.project1.entity.Comment;
import java.util.List;

public interface CommentService {
    List<Comment> getAllComments();

    Comment getCommentById(Long id);

    Comment createComment(Comment comment);

    Comment updateComment(Long id, Comment updatedComment);

    void deleteComment(Long id);
}
