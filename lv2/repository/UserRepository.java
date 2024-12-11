package com.example.demo.lv2.repository;

import com.example.demo.lv2.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Long findByName(String name);
}
