package com.heima.chickenhousebackend.pojo;

import java.time.LocalDateTime;

public class Search {
    private Long id;           // 视频，文章/问题 id
    private String title;      // 文章/问题标题
    private String type;       // 类型
    private String comment;    // 文章/问题内容
    private String commentImg; // 文章/问题封面URL
    private Long userId;       // 发布者ID
    private LocalDateTime createTime;// 发布时间
    private Long likeCount=0L;    //点赞数
    private Long start=0L;        //收藏数
    private String videoUrl;   //视频地址
    private String imageUrl;   //视频封面地址
    private String description;//简介


    public Search() {
    }

    public Search(Long id, String title, String type, String comment, String commentImg, Long userId, LocalDateTime createTime, Long likeCount, Long start, String videoUrl, String imageUrl, String description) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.comment = comment;
        this.commentImg = commentImg;
        this.userId = userId;
        this.createTime = createTime;
        this.likeCount = likeCount;
        this.start = start;
        this.videoUrl = videoUrl;
        this.imageUrl = imageUrl;
        this.description = description;
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
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
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
     * @return start
     */
    public Long getStart() {
        return start;
    }

    /**
     * 设置
     * @param start
     */
    public void setStart(Long start) {
        this.start = start;
    }

    /**
     * 获取
     * @return videoUrl
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * 设置
     * @param videoUrl
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     * 获取
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 获取
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Search{id = " + id + ", title = " + title + ", type = " + type + ", comment = " + comment + ", commentImg = " + commentImg + ", userId = " + userId + ", createTime = " + createTime + ", likeCount = " + likeCount + ", start = " + start + ", videoUrl = " + videoUrl + ", imageUrl = " + imageUrl + ", description = " + description + "}";
    }
}
