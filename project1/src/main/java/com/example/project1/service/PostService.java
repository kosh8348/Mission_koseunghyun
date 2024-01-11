package com.example.project1.service;

import com.example.project1.entity.Board;
import com.example.project1.entity.Post;
import com.example.project1.repository.PostRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    // 특정 게시판에 속한 게시글 목록 조회
    public List<Post> getPostsByBoard(Board board) {
        return postRepository.findByBoardOrderByCreatedDateDesc(board);
    }

    // 특정 게시글 조회
    public Post getPostById(Long postId) {
        return postRepository.findById(postId).orElse(null);
    }

    // 새로운 게시글 생성
    public void createPost(Long boardId, String title, String content, String password) {
        // 게시글 생성 로직
        Post post = new Post(boardId, title, content, password);
        postRepository.save(post);
    }


    // 게시글 수정
    public void editPost(Long postId, String title, String content, String password) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new EntityNotFoundException("Post not found with id: " + postId));

        // 제공된 비밀번호가 게시글의 비밀번호와 일치하는지 확인 (인증)
        if (!password.equals(post.getPassword())) {
            throw new SecurityException("Invalid password for editing the post.");
        }

        // 게시글 세부정보 업데이트
        post.setTitle(title);
        post.setContent(content);

        postRepository.save(post);
    }

    // 게시글 삭제
    public void deletePost(Long postId, String password) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new EntityNotFoundException("Post not found with id: " + postId));

        // 제공된 비밀번호가 게시글의 비밀번호와 일치하는지 확인 (인증)
        if (!password.equals(post.getPassword())) {
            throw new SecurityException("Invalid password for deleting the post.");
        }

        postRepository.delete(post);
    }
}
