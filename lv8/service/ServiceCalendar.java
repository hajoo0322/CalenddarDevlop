package com.example.demo.lv8.service;

import com.example.demo.lv8.dto.PageResponseDto;
import com.example.demo.lv8.dto.PatchRequestCalendarDto;
import com.example.demo.lv8.dto.RequestCalendarDto;
import com.example.demo.lv8.dto.ResponseCalendarDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceCalendar {

    ResponseCalendarDto addCalendar(RequestCalendarDto requestCalendarDto, Long id);

    List<ResponseCalendarDto> getCalendar(Long id);

    Page<PageResponseDto> getPageCalendar(Pageable pageable);

    ResponseCalendarDto updateCalendar(PatchRequestCalendarDto patchRequestCalendarDto);

    void deleteCalendar(Long id);
}
