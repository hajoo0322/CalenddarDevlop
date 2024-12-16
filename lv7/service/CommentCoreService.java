package com.example.demo.lv7.service;

import com.example.demo.lv7.dto.PatchRequestComment;
import com.example.demo.lv7.dto.RequestCommentDto;
import com.example.demo.lv7.dto.ResponseCommentDto;
import com.example.demo.lv7.entity.CommentEntity;
import com.example.demo.lv7.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentCoreService implements CommentService{
    CommentRepository commentRepository;

    public CommentCoreService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public ResponseCommentDto addComment(RequestCommentDto requestCommentDto, Long userId) {
        CommentEntity commentEntity = new CommentEntity(userId, requestCommentDto);
        CommentEntity save = commentRepository.save(commentEntity);
        return new ResponseCommentDto(save);

    }

    @Override
    public List<ResponseCommentDto> getComment(Long calenderId) {
        List<CommentEntity> allByCalendarId = commentRepository.findAllByCalendarId(calenderId);

        return allByCalendarId.stream()
                .map(ResponseCommentDto::new).collect(Collectors.toList());

    }

    @Override
    public ResponseCommentDto updateComment(PatchRequestComment patchRequestComment) {
        CommentEntity commentEntity = commentRepository.findById(patchRequestComment.getCommentId()).orElseThrow(() -> new RuntimeException("해당 댓글을 찾을수 없습니다."));
        commentEntity.setComment(patchRequestComment.getNewComment());
        CommentEntity save = commentRepository.save(commentEntity);
        return new ResponseCommentDto(save);
    }

    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }
}
