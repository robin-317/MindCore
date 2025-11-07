package com.heima.chickenhousebackend.pojo;

public class User {
    private Integer id;            // 用户ID
    private String username;    // 用户名
    private String password;    // 密码
    private String avatar;      // 用户头像
    private String signature;   // 签名

    public User() {
    }

    public User(Integer id, String username, String password, String avatar, String signature) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.signature = signature;
    }

    /**
     * 获取
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 设置
     * @param signature
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", password = " + password + ", avatar = " + avatar + ", signature = " + signature + "}";
    }
}