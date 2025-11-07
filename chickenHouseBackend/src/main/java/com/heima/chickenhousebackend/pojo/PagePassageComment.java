package com.heima.chickenhousebackend.pojo;

public class PagePassageComment {
    private Long passageId;
    private Integer size;
    private Integer pageSize;

    public PagePassageComment() {
    }

    public PagePassageComment(Long passageId, Integer size, Integer pageSize) {
        this.passageId = passageId;
        this.size = size;
        this.pageSize = pageSize;
    }

    /**
     * 获取
     * @return passageId
     */
    public Long getPassageId() {
        return passageId;
    }

    /**
     * 设置
     * @param passageId
     */
    public void setPassageId(Long passageId) {
        this.passageId = passageId;
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
        return "PagePassageComment{passageId = " + passageId + ", size = " + size + ", pageSize = " + pageSize + "}";
    }
}
