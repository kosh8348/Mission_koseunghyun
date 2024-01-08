package com.example.project1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Post {
    @Id
    private Long id;

    private String title;
    private String content;
    private LocalDateTime createdAt;

    // Getter, Setter, Constructors 생략
}
