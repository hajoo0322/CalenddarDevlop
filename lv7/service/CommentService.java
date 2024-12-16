package com.example.demo.lv7.service;

import com.example.demo.lv7.dto.RequestCommentDto;
import com.example.demo.lv7.dto.ResponseCommentDto;

import java.util.List;

public interface CommentService {

    ResponseCommentDto addComment(RequestCommentDto requestCommentDto, Long userId);

    List<ResponseCommentDto> getComment(Long calendarId);
}
