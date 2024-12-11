package com.example.demo.lv2.controller;

import com.example.demo.lv2.dto.RequestCalendarDto;
import com.example.demo.lv2.dto.ResponseCalendarDto;
import com.example.demo.lv2.service.ServiceCalendar;
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
    public ResponseEntity<ResponseCalendarDto> addCalendar(@RequestBody RequestCalendarDto requestCalendarDto) {
        return new ResponseEntity<>(serviceCalendar.addCalendar(requestCalendarDto), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseCalendarDto> getCalendar(@PathVariable("id") Long id) {
        return new ResponseEntity<>(serviceCalendar.getCalendar(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ResponseCalendarDto>> getAllCalendar() {
        return new ResponseEntity<>(serviceCalendar.getAllCalendar(), HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ResponseCalendarDto> updateCalendar(@RequestBody RequestCalendarDto requestCalendarDto, @PathVariable Long id) {
        return new ResponseEntity<>(serviceCalendar.updateCalendar(requestCalendarDto, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseCalendarDto> deleteCalendar(@PathVariable Long id) {
        return new ResponseEntity<>(serviceCalendar.deleteCalendar(id),HttpStatus.OK);
    }
}
