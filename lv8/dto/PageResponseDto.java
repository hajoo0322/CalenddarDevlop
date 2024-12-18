package com.example.demo.lv8.dto;

import com.example.demo.lv8.entity.CalendarEntity;

import java.time.LocalDateTime;

public class PageResponseDto {

    String title;
    String details;
    int commentCount;
    LocalDateTime createTime;
    LocalDateTime lastModifiedTime;
    String userName;


    public PageResponseDto(CalendarEntity calendar) {
        title = calendar.getTitle();
        details = calendar.getDetails();
        commentCount = calendar.getCommentEntityList().size();
        createTime = calendar.getCreatedDate();
        lastModifiedTime = calendar.getLastModifiedDate();
        userName = calendar.getUser().getName();
    }
}
