package com.example.demo.lv4.service;

import com.example.demo.lv4.dto.LoginRequestDto;
import com.example.demo.lv4.dto.RequestUserDto;
import com.example.demo.lv4.dto.ResponseUserDto;
import com.example.demo.lv4.entity.UserEntity;
import com.example.demo.lv4.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserCoreService implements UserService {

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
    public Long getUserId(LoginRequestDto loginRequestDto) {
        UserEntity user = userRepository.findByEmail(loginRequestDto.getEmail());
        if (loginRequestDto.getPassword().equals(user.getPassword())) {
            return user.getId();
        } else {
            throw new RuntimeException();
        }
    }
}
