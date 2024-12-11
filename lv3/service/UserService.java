package com.example.demo.lv3.service;

import com.example.demo.lv3.dto.RequestUserDto;
import com.example.demo.lv3.dto.ResponseUserDto;

public interface UserService {
    ResponseUserDto addUser(RequestUserDto requestUser);

    Long getUserId(String name);
}
