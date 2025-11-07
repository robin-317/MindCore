package com.heima.chickenhousebackend.pojo;

import java.util.List;

public class PageResult<T> {
    private Long total;
    private List<T> results;

    public PageResult() {

    }

    public PageResult(Long total, List<T> results) {
        this.total = total;
        this.results = results;
    }

    /**
     * 获取
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    /**
     * 设置
     * @param total
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * 获取
     * @return results
     */
    public List<T> getResults() {
        return results;
    }

    /**
     * 设置
     * @param results
     */
    public void setResults(List<T> results) {
        this.results = results;
    }

    public String toString() {
        return "PageResult{total = " + total + ", results = " + results + "}";
    }
}
