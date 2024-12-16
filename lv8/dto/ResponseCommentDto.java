package com.example.demo.lv8.dto;

import com.example.demo.lv8.entity.CommentEntity;
import lombok.Getter;

@Getter
public class ResponseCommentDto {

    private final Long commentId;

    private final Long userId;

    private final Long calendarId;

    private final String comment;


    public ResponseCommentDto(CommentEntity commentEntity) {
        this.commentId = commentEntity.getId();
        this.userId = commentEntity.getUserId();
        this.calendarId = commentEntity.getCalendarId();
        this.comment = commentEntity.getComment();
    }

}
