package com.example.demo.lv8.repository;

import com.example.demo.lv8.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity,Long> {
    List<CommentEntity> findAllByCalendarId(Long calenderId);
}
