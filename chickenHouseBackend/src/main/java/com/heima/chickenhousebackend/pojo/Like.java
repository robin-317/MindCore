package com.heima.chickenhousebackend.pojo;

public class Like {
    private Long id;            //id
    private Integer type;       //0：文章 1：视频
    private Long toLikeId;    //被点赞的文章/视频id
    private Long userId;       //点赞用户id
    private Integer isLike=0;     //0：未点赞，1：已点赞
    private Integer isStart=0;     //0：未收藏，1：已收藏


    public Like() {
    }

    public Like(Long id, Integer type, Long toLikeId, Long userId, Integer isLike, Integer isStart) {
        this.id = id;
        this.type = type;
        this.toLikeId = toLikeId;
        this.userId = userId;
        this.isLike = isLike;
        this.isStart = isStart;
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
     * @return toLikeId
     */
    public Long getToLikeId() {
        return toLikeId;
    }

    /**
     * 设置
     * @param toLikeId
     */
    public void setToLikeId(Long toLikeId) {
        this.toLikeId = toLikeId;
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
     * @return isLike
     */
    public Integer getIsLike() {
        return isLike;
    }

    /**
     * 设置
     * @param isLike
     */
    public void setIsLike(Integer isLike) {
        this.isLike = isLike;
    }

    /**
     * 获取
     * @return isStart
     */
    public Integer getIsStart() {
        return isStart;
    }

    /**
     * 设置
     * @param isStart
     */
    public void setIsStart(Integer isStart) {
        this.isStart = isStart;
    }

    public String toString() {
        return "Like{id = " + id + ", type = " + type + ", toLikeId = " + toLikeId + ", userId = " + userId + ", isLike = " + isLike + ", isStart = " + isStart + "}";
    }
}
