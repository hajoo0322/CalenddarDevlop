package com.example.demo.lv7.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class RequestCommentDto {

    @NotNull
    private final Long calendarId;

    @NotNull
    private final String comment;

    public RequestCommentDto(Long calendarId, String comment) {
        this.calendarId = calendarId;
        this.comment = comment;
    }
}
