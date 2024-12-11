package com.example.demo.lv2.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class RequestCalendarDto {
    private final String name;
    private final String title;
    private final String details;

    @JsonCreator
    public RequestCalendarDto(
            @JsonProperty("name") String name,
            @JsonProperty("title") String title,
            @JsonProperty("details") String details
    ) {
        this.name = name;
        this.title = title;
        this.details = details;
    }
}
