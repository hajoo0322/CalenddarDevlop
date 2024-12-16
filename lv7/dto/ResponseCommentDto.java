package com.example.demo.lv7.dto;

import com.example.demo.lv7.entity.CommentEntity;

public class ResponseCommentDto {

    private Long userId;

    private Long calendarId;

    private String comment;


    public ResponseCommentDto(CommentEntity commentEntity) {
        this.userId = commentEntity.getUserId();
        this.calendarId = commentEntity.getCalendarId();
        this.comment = commentEntity.getComment();
    }

}
