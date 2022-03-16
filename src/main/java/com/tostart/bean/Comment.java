package com.tostart.bean;

import java.util.Date;

public class Comment {
    private Integer commentId;

    private Integer commentProjectId;

    private Integer commentUserId;

    private String commentContent;

    private Date commentDate;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentProjectId() {
        return commentProjectId;
    }

    public void setCommentProjectId(Integer commentProjectId) {
        this.commentProjectId = commentProjectId;
    }

    public Integer getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(Integer commentUserId) {
        this.commentUserId = commentUserId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }
}