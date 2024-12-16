package com.example.demo.lv7.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class PatchRequestComment {

    private Long commentId;

    private String newComment;

    @JsonCreator
    public PatchRequestComment(
            @JsonProperty("comment_id") Long commentId,
            @JsonProperty("new_comment") String newComment) {
        this.commentId = commentId;
        this.newComment = newComment;
    }
}
