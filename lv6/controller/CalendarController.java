package com.example.demo.lv6.controller;

import com.example.demo.lv6.dto.PatchRequestCalendarDto;
import com.example.demo.lv6.dto.RequestCalendarDto;
import com.example.demo.lv6.dto.ResponseCalendarDto;
import com.example.demo.lv6.service.ServiceCalendar;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendar")
public class CalendarController {
    ServiceCalendar serviceCalendar;

    public CalendarController(ServiceCalendar serviceCalendar) {
        this.serviceCalendar = serviceCalendar;
    }

    @PostMapping
    public ResponseEntity<ResponseCalendarDto> addCalendar(@Valid @RequestBody RequestCalendarDto requestCalendarDto, HttpSession session) {
        Long userId = (Long) session.getAttribute("userId");
        return new ResponseEntity<>(serviceCalendar.addCalendar(requestCalendarDto,userId), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ResponseCalendarDto>> getCalendar(HttpSession session) {
        Long userId = (Long) session.getAttribute("userId");
        return new ResponseEntity<>(serviceCalendar.getCalendar(userId), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ResponseCalendarDto>> getAllCalendar() {
        return new ResponseEntity<>(serviceCalendar.getAllCalendar(), HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<ResponseCalendarDto> updateCalendar(@Valid @RequestBody PatchRequestCalendarDto patchRequestCalendarDto) {
        return new ResponseEntity<>(serviceCalendar.updateCalendar(patchRequestCalendarDto), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteCalendar(HttpSession session) {
        Long userId = (Long) session.getAttribute("userId");
        serviceCalendar.deleteCalendar(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
