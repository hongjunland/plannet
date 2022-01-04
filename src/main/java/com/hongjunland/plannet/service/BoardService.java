package com.hongjunland.plannet.service;

import com.hongjunland.plannet.dto.BoardDto;
import com.hongjunland.plannet.entity.Board;
import com.hongjunland.plannet.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public Board writeBoard(Board board){
        return boardRepository.save(board);
    }
    public Board getBoardById(Long id){
        return boardRepository.findById(id).orElseThrow();
    }
    public Board updateBoard(Long id, BoardDto boardDto){
        Board board = boardRepository.getById(id);
        return boardRepository.save(board.updateBoard(boardDto));
    }
    public void deleteBoard(Long id){ boardRepository.deleteById(id);}
    public List<Board> getAll(){
        return boardRepository.findAll();
    }

}
