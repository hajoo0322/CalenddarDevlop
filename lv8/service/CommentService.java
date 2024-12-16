package com.example.demo.lv8.service;

import com.example.demo.lv8.dto.PatchRequestComment;
import com.example.demo.lv8.dto.RequestCommentDto;
import com.example.demo.lv8.dto.ResponseCommentDto;

import java.util.List;

public interface CommentService {

    ResponseCommentDto addComment(RequestCommentDto requestCommentDto, Long userId);

    List<ResponseCommentDto> getComment(Long calendarId);

    ResponseCommentDto updateComment(PatchRequestComment patchRequestComment);

    void deleteComment(Long id);
}
