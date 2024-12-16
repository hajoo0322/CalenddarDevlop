package com.example.demo.lv7.service;

import com.example.demo.lv7.dto.LoginRequestDto;
import com.example.demo.lv7.dto.RequestUserDto;
import com.example.demo.lv7.dto.ResponseUserDto;

public interface UserService {
    ResponseUserDto addUser(RequestUserDto requestUser);

    Long getUserId(LoginRequestDto loginRequestDto);
}
