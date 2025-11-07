package com.heima.chickenhousebackend.pojo;

public class PageVideoComment {
    private Long videoId;
    private Integer size;
    private Integer pageSize;

    public PageVideoComment() {
    }

    public PageVideoComment(Long videoId, Integer size, Integer pageSize) {
        this.videoId = videoId;
        this.size = size;
        this.pageSize = pageSize;
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
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 设置
     * @param size
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * 获取
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String toString() {
        return "PageVideoComment{videoId = " + videoId + ", size = " + size + ", pageSize = " + pageSize + "}";
    }
}
