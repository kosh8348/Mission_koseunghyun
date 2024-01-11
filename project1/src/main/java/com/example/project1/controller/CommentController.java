package com.example.project1.controller;

import com.example.project1.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/board/{boardId}/posts/{postId}/comments/create") // 새로운 댓글 작성 요청
    public String createComment(@PathVariable Long boardId, @PathVariable Long postId,
                                @RequestParam String content, @RequestParam String password,
                                // 게시판 ID, 게시글 ID, 댓글내용, 작성자 비밀번호를 받는다.
                                RedirectAttributes redirectAttributes) {
        commentService.createComment(boardId, postId, content, password); // 메소드를 호출해 새로운 댓글을 생성
        redirectAttributes.addAttribute("boardId", boardId);
        redirectAttributes.addAttribute("postId", postId);  // 게시판 Id와 게시글 ID를 전달
        return "redirect:/board/{boardId}/posts/{postId}";
    }

    @PostMapping("/board/{boardId}/posts/{postId}/comments/{commentId}/delete") // 댓글 삭제 요청
    public String deleteComment(@PathVariable Long boardId, @PathVariable Long postId,
                                @PathVariable Long commentId, @RequestParam String password,
                                // 게시판 ID, 게시글 ID, 삭제할 댓글 ID, 삭제 비밀번호를 받는다
                                RedirectAttributes redirectAttributes) {
        commentService.deleteComment(commentId, password);
        redirectAttributes.addAttribute("boardId", boardId);
        redirectAttributes.addAttribute("postId", postId);  // 삭제된 후 해당 게시글 상세 페이지로 리다이렉션
        return "redirect:/board/{boardId}/posts/{postId}";
    }
}
