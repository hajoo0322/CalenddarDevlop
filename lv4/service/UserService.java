package com.example.demo.lv4.service;

import com.example.demo.lv4.dto.RequestUserDto;
import com.example.demo.lv4.dto.ResponseUserDto;

public interface UserService {
    ResponseUserDto addUser(RequestUserDto requestUser);

    Long getUserId(String name, String password);
}
