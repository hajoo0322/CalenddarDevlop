package com.example.demo.lv2.service;

import com.example.demo.lv2.dto.RequestUserDto;
import com.example.demo.lv2.dto.ResponseUserDto;

public interface UserService {
    ResponseUserDto addUser(RequestUserDto requestUser);
}
