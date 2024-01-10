package com.example.project1.controller;

import com.example.project1.entity.Board;
import com.example.project1.entity.Post;
import com.example.project1.service.BoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping
    public List<Board> getAllBoards() {
        return boardService.getAllBoards();
    }

    @GetMapping("/{boardId}/posts")
    public List<Post> getPostsByBoard(@PathVariable Board boardId) {
        Board board = boardService.getBoardById(boardId);
        BoardController postService = null;
        return postService.getPostsByBoard(board);
    }
}
