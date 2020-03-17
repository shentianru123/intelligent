package com.share.intelligent.entity;

import java.io.Serializable;
import java.util.Date;

public class CommentReplyEB  implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer commentReplyId;
    private Integer childCommentReplyId;
    private Integer articleId;
    private String content;
    private String anonymous;
    private String userId;
    private Date crtTime;

    @Override
    public String toString() {
        return "CommentReplyEB{" +
                "commentReplyId=" + commentReplyId +
                ", childCommentReplyId=" + childCommentReplyId +
                ", articleId=" + articleId +
                ", content='" + content + '\'' +
                ", anonymous='" + anonymous + '\'' +
                ", userId='" + userId + '\'' +
                ", crtTime=" + crtTime +
                '}';
    }

    public Integer getCommentReplyId() {
        return commentReplyId;
    }

    public void setCommentReplyId(Integer commentReplyId) {
        this.commentReplyId = commentReplyId;
    }

    public int getChildCommentReplyId() {
        return childCommentReplyId;
    }

    public void setChildCommentReplyId(Integer childCommentReplyId) {
        this.childCommentReplyId = childCommentReplyId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(String anonymous) {
        this.anonymous = anonymous;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }
}
