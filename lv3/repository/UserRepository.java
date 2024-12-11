package com.example.demo.lv3.repository;

import com.example.demo.lv3.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Long findByName(String name);
}
