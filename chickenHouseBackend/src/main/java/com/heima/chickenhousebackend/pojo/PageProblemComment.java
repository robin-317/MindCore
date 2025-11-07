package com.heima.chickenhousebackend.pojo;

public class PageProblemComment {
    private Long problemId;
    private Integer size;
    private Integer pageSize;

    public PageProblemComment() {
    }

    public PageProblemComment(Long problemId, Integer size, Integer pageSize) {
        this.problemId = problemId;
        this.size = size;
        this.pageSize = pageSize;
    }

    /**
     * 获取
     * @return problemId
     */
    public Long getProblemId() {
        return problemId;
    }

    /**
     * 设置
     * @param problemId
     */
    public void setProblemId(Long problemId) {
        this.problemId = problemId;
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
        return "PageProblemComment{problemId = " + problemId + ", size = " + size + ", pageSize = " + pageSize + "}";
    }
}
