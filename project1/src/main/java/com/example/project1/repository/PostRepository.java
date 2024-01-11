package com.example.project1.repository;


import com.example.project1.entity.Board;
import com.example.project1.entity.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    List<Post> findByBoardOrderByCreatedDateDesc(Board board);
}
