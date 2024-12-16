package com.example.demo.lv6.service;

import com.example.demo.lv6.dto.LoginRequestDto;
import com.example.demo.lv6.dto.RequestUserDto;
import com.example.demo.lv6.dto.ResponseUserDto;

public interface UserService {
    ResponseUserDto addUser(RequestUserDto requestUser);

    Long getUserId(LoginRequestDto loginRequestDto);
}
