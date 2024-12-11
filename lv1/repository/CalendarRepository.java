package com.example.demo.lv1.repository;

import com.example.demo.lv1.entity.CalendarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarRepository extends JpaRepository<CalendarEntity,Long> {
}
