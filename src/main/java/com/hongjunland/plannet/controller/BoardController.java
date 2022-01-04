package com.hongjunland.plannet.controller;

import com.hongjunland.plannet.dto.BoardDto;
import com.hongjunland.plannet.entity.Board;
import com.hongjunland.plannet.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "/api")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @PostMapping(value = "/board")
    public Board writeBoard(@RequestBody Board board){
        return boardService.writeBoard(board);
    }
    @GetMapping(value = "/board/{id}")
    public Board getBoardById(@PathVariable Long id){
        return boardService.getBoardById(id);
    }
    @GetMapping(value="/boards")
    public List<Board> getBoards(){
        return boardService.getAll();
    }
    @PutMapping(value = "/board/{id}")
    public Board updateBoard(@PathVariable Long id, @RequestBody BoardDto dto){
        return boardService.updateBoard(id,dto);
    }
    @DeleteMapping(value = "/board/{id}")
    public void deleteBoard(@PathVariable Long id){
        boardService.deleteBoard(id);
    }
}
