package com.vikash.ApiResponse.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
public class Comment
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int commentId;
    String message;
    @CreationTimestamp
    Instant commentTimestamp;

    public int getCommentId()
    {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Instant getCommentTimestamp() {
        return commentTimestamp;
    }

    public void setCommentTimestamp(Instant commentTimestamp) {
        this.commentTimestamp = commentTimestamp;
    }
}
