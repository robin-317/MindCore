package com.heima.chickenhousebackend.pojo;

import java.time.LocalDateTime;

public class History {

    private Long id;
    private Long authorId;
    private Long contentId;
    private Integer type;
    private LocalDateTime watchTime;
    private String title;
    private String img;
    private Long userId;

    public History() {
    }

    public History(Long id, Long authorId, Long contentId, Integer type, LocalDateTime watchTime, String title, String img, Long userId) {
        this.id = id;
        this.authorId = authorId;
        this.contentId = contentId;
        this.type = type;
        this.watchTime = watchTime;
        this.title = title;
        this.img = img;
        this.userId = userId;
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
     * @return authorId
     */
    public Long getAuthorId() {
        return authorId;
    }

    /**
     * 设置
     * @param authorId
     */
    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    /**
     * 获取
     * @return contentId
     */
    public Long getContentId() {
        return contentId;
    }

    /**
     * 设置
     * @param contentId
     */
    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    /**
     * 获取
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取
     * @return watchTime
     */
    public LocalDateTime getWatchTime() {
        return watchTime;
    }

    /**
     * 设置
     * @param watchTime
     */
    public void setWatchTime(LocalDateTime watchTime) {
        this.watchTime = watchTime;
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
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
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

    public String toString() {
        return "History{id = " + id + ", authorId = " + authorId + ", contentId = " + contentId + ", type = " + type + ", watchTime = " + watchTime + ", title = " + title + ", img = " + img + ", userId = " + userId + "}";
    }
}
