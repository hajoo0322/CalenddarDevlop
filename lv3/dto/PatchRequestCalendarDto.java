package com.example.demo.lv3.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class PatchRequestCalendarDto {

    private final RequestCalendarDto requestCalendarDto;

    private final String newDetails;

    @JsonCreator
    public PatchRequestCalendarDto(
            @JsonProperty("requestCalendarDto")
            RequestCalendarDto requestCalendarDto,
            @JsonProperty("newDetails")
            String newDetails)
    {
        this.requestCalendarDto = requestCalendarDto;
        this.newDetails = newDetails;
    }
}
