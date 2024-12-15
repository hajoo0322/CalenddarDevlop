package com.example.demo.lv5.entity;

import com.example.demo.lv5.dto.RequestCalendarDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class CalendarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Setter
    private String title;
    @Setter
    private String details;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    public CalendarEntity() {
    }

    public CalendarEntity(UserEntity userEntity, RequestCalendarDto requestCalendarDto) {
        this.user = userEntity;
        this.title = requestCalendarDto.getTitle();
        this.details = requestCalendarDto.getDetails();
    }

}
