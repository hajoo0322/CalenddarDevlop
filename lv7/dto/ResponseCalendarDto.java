package com.example.demo.lv7.dto;

import com.example.demo.lv7.entity.CalendarEntity;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ResponseCalendarDto {
    private Long id;
    private final String title;
    private final String details;
    private final LocalDateTime createdDate;
    private final LocalDateTime lastModifiedDate;

    public ResponseCalendarDto(CalendarEntity calendarEntity) {
        id = calendarEntity.getId();
        title = calendarEntity.getTitle();
        details = calendarEntity.getDetails();
        createdDate = calendarEntity.getCreatedDate();
        lastModifiedDate = calendarEntity.getLastModifiedDate();
    }
}
