package com.example.project1.repository;


import com.example.project1.entity.Board;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BoardRepository extends CrudRepository<Board, Long> {
    Optional<Object> findById(Board id);
}
