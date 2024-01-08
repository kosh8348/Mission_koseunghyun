package com.example.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project1.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    // 추가적인 메서드가 필요하면 여기에 작성할 수 있습니다.
}
