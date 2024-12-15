package com.example.demo.lv5.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class RequestUserDto {

    @NotNull
    @NotBlank
    @Size(max = 4)
    private final String name;

    @NotNull
    @Email
    private final String email;

    @JsonCreator
    public RequestUserDto(
            @JsonProperty("name") String name, @JsonProperty("email") String email) {
        this.name = name;
        this.email = email;
    }
}
