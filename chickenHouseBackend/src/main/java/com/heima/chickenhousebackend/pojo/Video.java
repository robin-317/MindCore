package com.heima.chickenhousebackend.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

public class Video {
    private Long id;           //视频ID
    private Long userId;       //发布用户ID
    private String videoUrl;   //视频地址
    private String imageUrl;   //视频封面地址
    private String title;      //标题
    private String description;//简介
    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime; // 创建时间
    private Long likeCount;    //点赞量
    private Long start;    //收藏量


    public Video() {
    }

    public Video(Long id, Long userId, String videoUrl, String imageUrl, String title, String description, LocalDateTime createTime, Long likeCount, Long start) {
        this.id = id;
        this.userId = userId;
        this.videoUrl = videoUrl;
        this.imageUrl = imageUrl;
        this.title = title;
        this.description = description;
        this.createTime = createTime;
        this.likeCount = likeCount;
        this.start = start;
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

    public String toString() {
        return "Video{id = " + id + ", userId = " + userId + ", videoUrl = " + videoUrl + ", imageUrl = " + imageUrl + ", title = " + title + ", description = " + description + ", createTime = " + createTime + ", likeCount = " + likeCount + ", start = " + start + "}";
    }
}