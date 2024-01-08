package com.example.project1.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String content;

    private LocalDateTime createdAt;

    private String authorPassword;

    @ManyToOne
    private Post post;

    // Constructors, Getters, Setters 생략
}
