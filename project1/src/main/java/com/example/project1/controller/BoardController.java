package com.example.project1.controller;

import com.example.project1.entity.Board;
import com.example.project1.service.BoardService;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/list")  // 게시판 리스트
    public List<Board> getAllBoards() {
        return boardService.getAllBoards();
    }


    @GetMapping("/{boardId}")   // 앤드포인트 (게시판 보기)
    public ResponseEntity<Board> getBoard(@PathVariable Long boardId) {
        Board board = boardService.getBoardById(boardId);
        return ResponseEntity.ok().body(board);
    }

    // Other CRUD endpoints for boards (create, update, delete) can be added here
}
