package com.example.demo.lv7.controller;

import com.example.demo.lv7.dto.RequestCommentDto;
import com.example.demo.lv7.dto.ResponseCommentDto;
import com.example.demo.lv7.service.CommentService;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public ResponseEntity<ResponseCommentDto> addComment(RequestCommentDto requestCommentDto, HttpSession httpSession) {
        Long userId = (Long) httpSession.getAttribute("userId");
        return new ResponseEntity<>(commentService.addComment(requestCommentDto, userId), HttpStatus.OK);
    }

    @GetMapping("/calendar/{calendar_id}")
    public ResponseEntity<List<ResponseCommentDto>> getComment(@PathVariable("calendar_id") Long calendarId) {
        return new ResponseEntity<>(commentService.getComment(calendarId), HttpStatus.OK);
    }
}
