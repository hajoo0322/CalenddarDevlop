package com.example.demo.lv5.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import lombok.Getter;

@Getter
public class RequestUserDto {
    private final String name;

    @Email
    private final String email;

    @JsonCreator
    public RequestUserDto(
            @JsonProperty("name") String name, @JsonProperty("email") String email) {
        this.name = name;
        this.email = email;
    }
}
