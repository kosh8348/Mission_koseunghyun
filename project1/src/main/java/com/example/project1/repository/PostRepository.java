package com.example.project1.repository;

import com.example.project1.entity.Board;
import com.example.project1.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByBoardOrderByCreatedDateDesc(Board board);
}
