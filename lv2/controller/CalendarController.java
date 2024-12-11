package com.example.demo.lv2.controller;

import com.example.demo.lv2.dto.PatchRequestCalendarDto;
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

    @PostMapping("/user/{id}")
    public ResponseEntity<ResponseCalendarDto> addCalendar(@RequestBody RequestCalendarDto requestCalendarDto, @PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(serviceCalendar.addCalendar(requestCalendarDto,id), HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<ResponseCalendarDto>> getCalendar(@PathVariable("id") Long id) {
        return new ResponseEntity<>(serviceCalendar.getCalendar(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ResponseCalendarDto>> getAllCalendar() {
        return new ResponseEntity<>(serviceCalendar.getAllCalendar(), HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<ResponseCalendarDto> updateCalendar(@RequestBody PatchRequestCalendarDto patchRequestCalendarDto) {
        return new ResponseEntity<>(serviceCalendar.updateCalendar(patchRequestCalendarDto), HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> deleteCalendar(@PathVariable Long id) {
        serviceCalendar.deleteCalendar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
