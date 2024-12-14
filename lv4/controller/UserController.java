package com.example.demo.lv4.controller;

import com.example.demo.lv4.dto.RequestUserDto;
import com.example.demo.lv4.dto.ResponseUserDto;
import com.example.demo.lv4.service.UserService;
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

    @PostMapping
    public ResponseEntity<ResponseUserDto> addUser(@Valid @RequestBody RequestUserDto requestUser) {
        return new ResponseEntity<>(userService.addUser(requestUser), HttpStatus.OK);
    }

    @GetMapping("/{name}/{password}")
    public ResponseEntity<Long> getUserId(@PathVariable(name = "name") String name, @PathVariable(name = "password")String password) {
        return new ResponseEntity<>(userService.getUserId(name,password), HttpStatus.OK);
    }

}
