package com.example.demo.lv2.service;

import com.example.demo.lv2.dto.RequestCalendarDto;
import com.example.demo.lv2.dto.ResponseCalendarDto;

import java.util.List;

public interface ServiceCalendar {

    ResponseCalendarDto addCalendar(RequestCalendarDto requestCalendarDto);

    ResponseCalendarDto getCalendar(Long id);

    List<ResponseCalendarDto> getAllCalendar();

    ResponseCalendarDto updateCalendar(RequestCalendarDto requestCalendarDto, Long id);

    ResponseCalendarDto deleteCalendar(Long id);
}
