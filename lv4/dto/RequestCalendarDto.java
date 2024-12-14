package com.example.demo.lv4.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class RequestCalendarDto {
    private final String title;
    private final String details;

    @JsonCreator
    public RequestCalendarDto(
            @JsonProperty("title") String title,
            @JsonProperty("details") String details
    ) {
        this.title = title;
        this.details = details;
    }
}
