package com.example.demo.lv6.repository;

import com.example.demo.lv6.entity.CalendarEntity;
import com.example.demo.lv6.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CalendarRepository extends JpaRepository<CalendarEntity,Long> {

    List<CalendarEntity> findByUser(UserEntity userEntity);

    CalendarEntity findByTitle(String title);

    void deleteByUser(UserEntity userEntity);
}