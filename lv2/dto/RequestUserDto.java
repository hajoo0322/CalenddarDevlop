package com.example.demo.lv2.dto;

import jakarta.validation.constraints.Email;
import lombok.Getter;

@Getter
public class RequestUserDto {
    private final String name;

    @Email
    private final String email;

    public RequestUserDto(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
