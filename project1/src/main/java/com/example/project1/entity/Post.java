package com.example.project1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String password; // 비밀번호 필드 추가
    private Date createdDate;

    @ManyToOne
    private Board board; // 다대일 관계 설정

    // 생성자, 게시판 정보를 받아와 설정
    public Post(Board board, String title, String content, String password) {
        this.board = board;
        this.title = title;
        this.content = content;
        this.password = password;
        this.createdDate = new Date();
    }

    public Post() {

    }

    public Post(Long boardId, String title, String content, String password) {
    }

    public String getPassword() {
        return null;
    }

    public void setTitle(String title) {
    }

    public void setContent(String content) {

    }

    public interface PostRepository extends CrudRepository<Post, Long> {
        List<Post> findByBoardIdOrderByCreatedDateDesc(Long boardId);
    }
}
