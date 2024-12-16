package com.example.demo.lv6.service;

import com.example.demo.lv6.dto.LoginRequestDto;
import com.example.demo.lv6.dto.RequestUserDto;
import com.example.demo.lv6.dto.ResponseUserDto;
import com.example.demo.lv6.entity.UserEntity;
import com.example.demo.lv6.hash.PasswordEncoder;
import com.example.demo.lv6.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserCoreService implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserCoreService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public ResponseUserDto addUser(RequestUserDto requestUser) {
        String encode = passwordEncoder.encode(requestUser.getPassword());
        UserEntity userEntity = new UserEntity(requestUser.getName(), requestUser.getEmail(),encode);
        UserEntity save = userRepository.save(userEntity);
        return new ResponseUserDto(save);
    }

    @Override
    public Long getUserId(LoginRequestDto loginRequestDto) {
        UserEntity user = userRepository.findByEmail(loginRequestDto.getEmail());
        if (passwordEncoder.matches(loginRequestDto.getPassword(),user.getPassword())) {
            return user.getId();
        } else {
            throw new RuntimeException();
        }
    }
}
