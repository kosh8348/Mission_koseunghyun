package com.example.project1.repository;

import com.example.project1.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    // 추가적인 메서드가 필요하면 여기에 작성할 수 있습니다.
}
