package com.hongjunland.plannet.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class BoardDto {
    private Long writer;
    private String title;
    private String content;
    private Date reportingDate;
    private Date modifiedDate;
}

//    `board_id`    INT              NOT NULL    AUTO_INCREMENT COMMENT '게시글ID',
//            `writer`      VARCHAR(50)      NOT NULL    COMMENT '작성자',
//            `title`       VARCHAR(50)      NOT NULL    COMMENT '제목',
//            `content`     VARCHAR(1000)    NOT NULL    COMMENT '내용',
//            `regdate`     DATETIME         NOT NULL    COMMENT '등록일자',
//            `updatedate`  DATETIME         NULL        COMMENT '수정일자',
//            `deletedate`  DATETIME         NULL        COMMENT '삭제일자',