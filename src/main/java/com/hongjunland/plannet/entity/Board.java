package com.hongjunland.plannet.entity;

import com.hongjunland.plannet.dto.BoardDto;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BOARD")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private String title;
    private String content;
    private Date reportingDate;
//    private Date modifiedDate;

    public Board updateBoard(BoardDto boardDto){
        this.title = boardDto.getTitle();
        this.content = boardDto.getContent();
//        this.modifiedDate = boardDto.getModifiedDate();
        return this;
//        this.modifiedDate = boardDto.getModifiedDate();
    }
}