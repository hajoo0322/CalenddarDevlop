package com.example.demo.lv5.service;

import com.example.demo.lv5.dto.LoginRequestDto;
import com.example.demo.lv5.dto.RequestUserDto;
import com.example.demo.lv5.dto.ResponseUserDto;

public interface UserService {
    ResponseUserDto addUser(RequestUserDto requestUser);

    Long getUserId(LoginRequestDto loginRequestDto);
}
