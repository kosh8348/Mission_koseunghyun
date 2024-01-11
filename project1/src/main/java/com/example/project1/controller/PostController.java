package com.example.project1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    // 게시글 상세 페이지를 보여주는 메소드
    @GetMapping("/board/{boardId}/posts/{postId}")
    public String showPost(@PathVariable Long boardId, @PathVariable Long postId, Model model) {
        return "post";
    }

    // 새로운 게시글을 작성하는 폼을 보여주는 메소드
    @GetMapping("/board/{boardId}/posts/create")
    public String showCreatePostForm(@PathVariable Long boardId, Model model) {
        // Logic to show the form to create a new post
        return "createPost";
    }

    // 새로운 게시글을 작성하는 메소드
    @PostMapping("/board/{boardId}/posts/create")
    public String createPost(@PathVariable Long boardId, @RequestParam String title, @RequestParam String content, @RequestParam String password) {
        // Logic to create a new post
        return "redirect:/board/{boardId}";
    }

    // 게시글을 수정하는 폼을 보여주는 메소드
    @GetMapping("/board/{boardId}/posts/{postId}/edit")
    public String showEditPostForm(@PathVariable Long boardId, @PathVariable Long postId, Model model) {
        // Logic to show the form to edit an existing post
        return "editPost";
    }

    // 게시글을 수정하는 메소드
    @PostMapping("/board/{boardId}/posts/{postId}/edit")
    public String editPost(@PathVariable Long boardId, @PathVariable Long postId, @RequestParam String title, @RequestParam String content, @RequestParam String password) {
        // Logic to edit an existing post
        return "redirect:/board/{boardId}/posts/{postId}";
    }

    // 게시글을 삭제하는 메소드
    @PostMapping("/board/{boardId}/posts/{postId}/delete")
    public String deletePost(@PathVariable Long boardId, @PathVariable Long postId, @RequestParam String password) {
        // Logic to delete an existing post
        return "redirect:/board/{boardId}";
    }
}
