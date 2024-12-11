package com.example.demo.lv2.service;

import com.example.demo.lv2.dto.RequestUserDto;
import com.example.demo.lv2.dto.ResponseUserDto;
import com.example.demo.lv2.entity.UserEntity;
import com.example.demo.lv2.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserCoreService implements UserService{

    private final UserRepository userRepository;

    public UserCoreService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public ResponseUserDto addUser(RequestUserDto requestUser) {
        UserEntity userEntity = new UserEntity(requestUser.getName(), requestUser.getEmail());
        UserEntity save = userRepository.save(userEntity);
        return new ResponseUserDto(save);
    }

    @Override
    public Long getUserId(String name) {
        Long id = userRepository.findByName(name);
        return id;
    }
}
