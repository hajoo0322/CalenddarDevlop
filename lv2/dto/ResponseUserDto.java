package com.example.demo.lv2.dto;

import com.example.demo.lv2.entity.UserEntity;

import java.time.LocalDateTime;

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