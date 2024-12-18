package com.example.demo.lv8.service;

import com.example.demo.lv8.dto.PageResponseDto;
import com.example.demo.lv8.dto.PatchRequestCalendarDto;
import com.example.demo.lv8.dto.RequestCalendarDto;
import com.example.demo.lv8.dto.ResponseCalendarDto;
import com.example.demo.lv8.entity.CalendarEntity;
import com.example.demo.lv8.entity.UserEntity;
import com.example.demo.lv8.repository.CalendarRepository;
import com.example.demo.lv8.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CalendarService implements ServiceCalendar {
    CalendarRepository calendarRepository;
    UserRepository userRepository;

    public CalendarService(CalendarRepository calendarRepository, UserRepository userRepository) {
        this.calendarRepository = calendarRepository;
        this.userRepository = userRepository;
    }

    @Override
    public ResponseCalendarDto addCalendar(RequestCalendarDto requestCalendarDto, Long id) {
        Optional<UserEntity> byId = userRepository.findById(id);
        CalendarEntity calendar = new CalendarEntity(byId.get(), requestCalendarDto);
        CalendarEntity save = calendarRepository.save(calendar);
        return new ResponseCalendarDto(save);
    }

    @Override
    public List<ResponseCalendarDto> getCalendar(Long id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(() -> new RuntimeException("user not found"));
        List<CalendarEntity> byUser = calendarRepository.findByUser(userEntity);
        return byUser.stream()
                .map(ResponseCalendarDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public Page<PageResponseDto> getPageCalendar(Pageable pageable) {
        Page<CalendarEntity> calendarEntities =
                calendarRepository.findAll(pageable);
        return calendarEntities.map(PageResponseDto::new);

    }

    @Override
    public ResponseCalendarDto updateCalendar(PatchRequestCalendarDto patchRequestCalendarDto) {
        CalendarEntity calendar = calendarRepository.findByTitle(patchRequestCalendarDto.getRequestCalendarDto().getTitle());
        calendar.setDetails(patchRequestCalendarDto.getNewDetails());
        CalendarEntity save = calendarRepository.save(calendar);
        return new ResponseCalendarDto(save);
    }

    @Override
    public void deleteCalendar(Long id) {
        calendarRepository.deleteById(id);
    }
}
