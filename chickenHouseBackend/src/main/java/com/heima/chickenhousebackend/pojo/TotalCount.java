package com.heima.chickenhousebackend.pojo;

public class TotalCount {
    private Long passageCount;
    private Long videoCount;
    private Long problemCount;

    public TotalCount() {
    }

    public TotalCount(Long passageCount, Long videoCount, Long problemCount) {
        this.passageCount = passageCount;
        this.videoCount = videoCount;
        this.problemCount = problemCount;
    }

    /**
     * 获取
     * @return passageCount
     */
    public Long getPassageCount() {
        return passageCount;
    }

    /**
     * 设置
     * @param passageCount
     */
    public void setPassageCount(Long passageCount) {
        this.passageCount = passageCount;
    }

    /**
     * 获取
     * @return videoCount
     */
    public Long getVideoCount() {
        return videoCount;
    }

    /**
     * 设置
     * @param videoCount
     */
    public void setVideoCount(Long videoCount) {
        this.videoCount = videoCount;
    }

    /**
     * 获取
     * @return problemCount
     */
    public Long getProblemCount() {
        return problemCount;
    }

    /**
     * 设置
     * @param problemCount
     */
    public void setProblemCount(Long problemCount) {
        this.problemCount = problemCount;
    }

    public String toString() {
        return "TotalCount{passageCount = " + passageCount + ", videoCount = " + videoCount + ", problemCount = " + problemCount + "}";
    }
}
