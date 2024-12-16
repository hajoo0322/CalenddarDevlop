package com.example.demo.lv7.dto;

import com.example.demo.lv7.entity.UserEntity;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ResponseUserDto {
    private final Long id;
    private final String name;
    private final String email;
    private final LocalDateTime createDate;

    public ResponseUserDto(UserEntity userEntity) {
        this.id = userEntity.getId();
        this.name = userEntity.getName();
        this.email = userEntity.getEmail();
        this.createDate = userEntity.getCreateDate();
    }
}
