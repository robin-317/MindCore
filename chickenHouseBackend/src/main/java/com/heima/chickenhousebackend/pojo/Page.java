package com.heima.chickenhousebackend.pojo;

public class Page {
    private Integer type=0;
    private Integer page=1;
    private Integer pageSize=24;
    private Long userId;


    public Page() {
    }

    public Page(Integer type, Integer page, Integer pageSize, Long userId) {
        this.type = type;
        this.page = page;
        this.pageSize = pageSize;
        this.userId = userId;
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
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * 设置
     * @param page
     */
    public void setPage(Integer page) {
        this.page = page;
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
        return "Page{type = " + type + ", page = " + page + ", pageSize = " + pageSize + ", userId = " + userId + "}";
    }
}
