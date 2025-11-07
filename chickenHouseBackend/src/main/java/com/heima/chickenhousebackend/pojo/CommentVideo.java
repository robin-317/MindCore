package com.heima.chickenhousebackend.pojo;

import java.time.LocalDateTime;

public class CommentVideo {
    private Long id;                    // 评论id
    private String comment;             // 评论内容
    private LocalDateTime createdAt;    // 评论时间
    private String roleName;           // 发布者用户名
    private Long videoId;               // 所属视频id
    private Long likeCount;             // 点赞次数
    private Long rootCommentId;         // 根评论ID
    private Long parentId;              // 父评论id
    private String parentName;          // 父评论用户名
    private String userImg;             // 发布者头像url


    public CommentVideo() {
    }

    public CommentVideo(Long id, String comment, LocalDateTime createdAt, String roleName, Long videoId, Long likeCount, Long rootCommentId, Long parentId, String parentName, String userImg) {
        this.id = id;
        this.comment = comment;
        this.createdAt = createdAt;
        this.roleName = roleName;
        this.videoId = videoId;
        this.likeCount = likeCount;
        this.rootCommentId = rootCommentId;
        this.parentId = parentId;
        this.parentName = parentName;
        this.userImg = userImg;
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
     * @return createdAt
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置
     * @param createdAt
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取
     * @return videoId
     */
    public Long getVideoId() {
        return videoId;
    }

    /**
     * 设置
     * @param videoId
     */
    public void setVideoId(Long videoId) {
        this.videoId = videoId;
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
     * @return rootCommentId
     */
    public Long getRootCommentId() {
        return rootCommentId;
    }

    /**
     * 设置
     * @param rootCommentId
     */
    public void setRootCommentId(Long rootCommentId) {
        this.rootCommentId = rootCommentId;
    }

    /**
     * 获取
     * @return parentId
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取
     * @return parentName
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * 设置
     * @param parentName
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**
     * 获取
     * @return userImg
     */
    public String getUserImg() {
        return userImg;
    }

    /**
     * 设置
     * @param userImg
     */
    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String toString() {
        return "CommentVideo{id = " + id + ", comment = " + comment + ", createdAt = " + createdAt + ", roleName = " + roleName + ", videoId = " + videoId + ", likeCount = " + likeCount + ", rootCommentId = " + rootCommentId + ", parentId = " + parentId + ", parentName = " + parentName + ", userImg = " + userImg + "}";
    }
}