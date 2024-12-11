package com.example.demo.lv2.controller;

import com.example.demo.lv2.dto.RequestUserDto;
import com.example.demo.lv2.dto.ResponseUserDto;
import com.example.demo.lv2.service.UserService;
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

    @PostMapping
    public ResponseEntity<ResponseUserDto> addUser(@RequestBody RequestUserDto requestUser) {
        return new ResponseEntity<>(userService.addUser(requestUser), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Long> getUserId(@PathVariable(name = "name") String name) {
        return new ResponseEntity<>(userService.getUserId(name), HttpStatus.OK);
    }

}
