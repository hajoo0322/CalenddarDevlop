package com.example.demo.lv8.service;

import com.example.demo.lv8.dto.LoginRequestDto;
import com.example.demo.lv8.dto.RequestUserDto;
import com.example.demo.lv8.dto.ResponseUserDto;

public interface UserService {
    ResponseUserDto addUser(RequestUserDto requestUser);

    Long getUserId(LoginRequestDto loginRequestDto);
}
