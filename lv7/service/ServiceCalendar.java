package com.example.demo.lv7.service;

import com.example.demo.lv7.dto.PatchRequestCalendarDto;
import com.example.demo.lv7.dto.RequestCalendarDto;
import com.example.demo.lv7.dto.ResponseCalendarDto;

import java.util.List;

public interface ServiceCalendar {

    ResponseCalendarDto addCalendar(RequestCalendarDto requestCalendarDto, Long id);

    List<ResponseCalendarDto> getCalendar(Long id);

    List<ResponseCalendarDto> getAllCalendar();

    ResponseCalendarDto updateCalendar(PatchRequestCalendarDto patchRequestCalendarDto);

    void deleteCalendar(Long id);
}
