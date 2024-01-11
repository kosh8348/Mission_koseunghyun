package com.example.project1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BoardController {

    @GetMapping("/boards")
    public String showBoardList(Model model) {
        // 게시판 게시글목록보기
        return "boardList";
    }

    @GetMapping("/board/{id}")
    public String showBoard(@PathVariable String id, Model model) {
        // 게시판 전체보기
        model.addAttribute("boardId", id);
        return "board";
    }
}
