package com.example.project1.service;

import com.example.project1.entity.Board;
import com.example.project1.entity.Post;
import com.example.project1.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getPostsByBoard(Board board) {
        return postRepository.findByBoardOrderByCreatedDateDesc(board);
    }

    public Post getPostById(Long postId) {
        return null;
    }

    // 추가적인 서비스 메서드가 필요하다면 정의
}
