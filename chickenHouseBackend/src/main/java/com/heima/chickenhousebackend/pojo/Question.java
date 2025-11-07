package com.heima.chickenhousebackend.pojo;

import java.time.LocalDateTime;

public class Question {
    private Long id;             // 问题id
    private String title;        // 标题
    private String comment;      // 问题内容
    private String commentImg;   // 图片url
    private Long userId;         // 所属用户id
    private Long likeCount;      // 点赞量
    private Long starCount;      // 收藏量
    private Boolean console;     // 是否解决
    private LocalDateTime createTime;     // 发布时间

    public Question() {
    }

    public Question(Long id, String title, String comment, String commentImg, Long userId, Long likeCount, Long starCount, Boolean console, LocalDateTime createTime) {
        this.id = id;
        this.title = title;
        this.comment = comment;
        this.commentImg = commentImg;
        this.userId = userId;
        this.likeCount = likeCount;
        this.starCount = starCount;
        this.console = console;
        this.createTime = createTime;
    }

    /**
     * 获取
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 获取
     * @return commentImg
     */
    public String getCommentImg() {
        return commentImg;
    }

    /**
     * 设置
     * @param commentImg
     */
    public void setCommentImg(String commentImg) {
        this.commentImg = commentImg;
    }

    /**
     * 获取
     * @return userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取
     * @return likeCount
     */
    public Long getLikeCount() {
        return likeCount;
    }

    /**
     * 设置
     * @param likeCount
     */
    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * 获取
     * @return starCount
     */
    public Long getStarCount() {
        return starCount;
    }

    /**
     * 设置
     * @param starCount
     */
    public void setStarCount(Long starCount) {
        this.starCount = starCount;
    }

    /**
     * 获取
     * @return console
     */
    public Boolean getConsole() {
        return console;
    }

    /**
     * 设置
     * @param console
     */
    public void setConsole(Boolean console) {
        this.console = console;
    }

    /**
     * 获取
     * @return createTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置
     * @param createTime
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String toString() {
        return "Question{id = " + id + ", title = " + title + ", comment = " + comment + ", commentImg = " + commentImg + ", userId = " + userId + ", likeCount = " + likeCount + ", starCount = " + starCount + ", console = " + console + ", createTime = " + createTime + "}";
    }
}
