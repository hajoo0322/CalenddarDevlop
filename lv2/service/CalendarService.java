package com.example.demo.lv2.service;

import com.example.demo.lv2.dto.RequestCalendarDto;
import com.example.demo.lv2.dto.ResponseCalendarDto;
import com.example.demo.lv2.entity.CalendarEntity;
import com.example.demo.lv2.repository.CalendarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalendarService implements ServiceCalendar {
    CalendarRepository calendarRepository;

    public CalendarService(CalendarRepository calendarRepository) {
        this.calendarRepository = calendarRepository;
    }

    @Override
    public ResponseCalendarDto addCalendar(RequestCalendarDto requestCalendarDto) {


        return null;
    }

    @Override
    public ResponseCalendarDto getCalendar(Long id) {
        CalendarEntity calendar = calendarRepository.findById(id).orElseThrow(() -> new RuntimeException("user not found"));
        return new ResponseCalendarDto(calendar);
    }

    @Override
    public List<ResponseCalendarDto> getAllCalendar() {
        List<CalendarEntity> all = calendarRepository.findAll();
        return all.stream()
                .map(ResponseCalendarDto::new).collect(Collectors.toList());
    }

    @Override
    public ResponseCalendarDto updateCalendar(RequestCalendarDto requestCalendarDto, Long id) {
        return null;
    }

    @Override
    public ResponseCalendarDto deleteCalendar(Long id) {
        CalendarEntity calendar = calendarRepository.findById(id).orElseThrow(() -> new RuntimeException("user not found"));
        calendarRepository.deleteById(id);
        return new ResponseCalendarDto(calendar);
    }
}
