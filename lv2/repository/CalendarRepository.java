package com.example.demo.lv2.repository;

import com.example.demo.lv2.entity.CalendarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarRepository extends JpaRepository<CalendarEntity,Long> {
}
