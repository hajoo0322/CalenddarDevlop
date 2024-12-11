package com.example.demo.lv2.repository;

import com.example.demo.lv2.entity.CalendarEntity;
import com.example.demo.lv2.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CalendarRepository extends JpaRepository<CalendarEntity,Long> {

    List<CalendarEntity> findByUser(UserEntity userEntity);

    CalendarEntity findByTitle(String title);

    void deleteByUser(UserEntity userEntity);
}
