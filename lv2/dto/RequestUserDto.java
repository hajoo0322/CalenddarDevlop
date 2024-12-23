package com.example.demo.lv2.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import lombok.Getter;

@Getter
public class RequestUserDto {
    private final String name;

    @Email
    private final String email;

    private final String password;

    @JsonCreator
    public RequestUserDto(
            @JsonProperty("name") String name,
            @JsonProperty("email") String email,
            @JsonProperty("password") String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
