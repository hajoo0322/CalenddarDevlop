package com.example.demo.lv2.dto;

import com.example.demo.lv2.entity.CalendarEntity;
import com.example.demo.lv2.entity.UserEntity;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ResponseCalendarDto {
    private Long id;
    private final String title;
    private final String details;
    private final LocalDateTime createdDate;
    private final LocalDateTime lastModifiedDate;
    private final UserEntity userEntity;

    public ResponseCalendarDto(CalendarEntity calendarEntity) {
        id = calendarEntity.getId();
        title = calendarEntity.getTitle();
        details = calendarEntity.getDetails();
        createdDate = calendarEntity.getCreatedDate();
        lastModifiedDate = calendarEntity.getLastModifiedDate();
        userEntity = calendarEntity.getUser();
    }
}
