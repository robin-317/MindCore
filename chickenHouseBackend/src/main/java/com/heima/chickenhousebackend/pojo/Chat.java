package com.heima.chickenhousebackend.pojo;

import java.time.LocalDateTime;

public class Chat {

    private Long id;
    private Long uid1;
    private Long uid2;
    private Long cid;
    private String content;
    private LocalDateTime createTime;

    public Chat() {
    }

    public Chat(Long id, Long uid1, Long uid2, Long cid, String content, LocalDateTime createTime) {
        this.id = id;
        this.uid1 = uid1;
        this.uid2 = uid2;
        this.cid = cid;
        this.content = content;
        this.createTime = createTime;
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
     * @return uid1
     */
    public Long getUid1() {
        return uid1;
    }

    /**
     * 设置
     * @param uid1
     */
    public void setUid1(Long uid1) {
        this.uid1 = uid1;
    }

    /**
     * 获取
     * @return uid2
     */
    public Long getUid2() {
        return uid2;
    }

    /**
     * 设置
     * @param uid2
     */
    public void setUid2(Long uid2) {
        this.uid2 = uid2;
    }

    /**
     * 获取
     * @return cid
     */
    public Long getCid() {
        return cid;
    }

    /**
     * 设置
     * @param cid
     */
    public void setCid(Long cid) {
        this.cid = cid;
    }

    /**
     * 获取
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
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

    public String toString() {
        return "Chat{id = " + id + ", uid1 = " + uid1 + ", uid2 = " + uid2 + ", cid = " + cid + ", content = " + content + ", createTime = " + createTime + "}";
    }
}
