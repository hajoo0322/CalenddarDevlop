package com.example.demo.lv4.controller;

import com.example.demo.lv4.dto.LoginRequestDto;
import com.example.demo.lv4.dto.RequestUserDto;
import com.example.demo.lv4.dto.ResponseUserDto;
import com.example.demo.lv4.service.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<ResponseUserDto> addUser(@Valid @RequestBody RequestUserDto requestUser) {
        return new ResponseEntity<>(userService.addUser(requestUser), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<Long> getUserId(@Valid @RequestBody LoginRequestDto loginRequestDto, HttpSession session) {
        Long userId = userService.getUserId(loginRequestDto);

        session.setAttribute("userid",userId);
        session.setAttribute("email", loginRequestDto.getEmail());

        return new ResponseEntity<>(userId, HttpStatus.OK);
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logoutUser(HttpSession session) {
        session.invalidate();
        return new ResponseEntity<>("로그아웃 성공", HttpStatus.OK);
    }

}
