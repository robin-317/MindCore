package com.heima.chickenhousebackend.service;

import com.heima.chickenhousebackend.pojo.*;

import java.util.List;

public interface UserService {
    //登录
    LoginInfo login(User user);
    User getInfo(User user);

    //注册
    void register(User user);

    //上传发布内容
    void postInformation(Video video);

    //发布文章
    void postText(Post post);

    //查询部分视频
    List<Video> listVideo();

    //查询部分文章
    List<Post> listText();

    //根据user_id查询用户信息
    User getByUserId(Video video);

    //根据用户id查询用户信息
    User getUserInfoById(Integer id);

    //查询部分视频_1
    List<Video> listVideo_1();

    //查询部分文章_1
    List<Post> listText_1();

    //分页查询视频
    PageResult<Video> pageVideo(Page page);
    //分页查询文章
    PageResult<Post> pageText(Page page);
    //分页查询问题
    PageResult<Question> pageQuestion(Page page);

    //根据id查询视频url
    Video getUrlById(Integer id);

    //返回文章、视频、问题的总数量
    TotalCount getTotalCount(Integer id);

    //分页查询，返回每一页的视频(限定当前用户)
    PageResult<Video> pageVideo_1(Page page);
    //分页查询，返回每一页的文章(限定当前用户)
    PageResult<Post> pageText_1(Page page);
    //分页查询，返回每一页的文章(限定当前用户)
    PageResult<Question> pageQuestion_1(Page page);

    //修改用户信息
    void changeInfo(Integer id, User user);

    //根据用户id获取用户文章展示的数据
    List<Post> getUserPassage(Integer id);

    //根据用户id获取用户视频展示的数据
    List<Video> getUserVideo(Integer id);

    //根据用户id获取用户问题展示的数据
    List<Question> getUserQuestion(Integer id);

    //根据用户id获取用户的文章收藏1
    List<Post> getUserPassage_1(Integer id);

    //根据id获取用户的视频收藏1
    List<Video> getUserVideo_1(Integer id);

    //根据id获取用户的问题收藏1
    List<Question> getUserQuestion_1(Integer id);

    //根据用户id查询用户收藏的数量
    Integer getAllStarCount(Integer id);

    //获取所有用户
    List<User> getAllUsers();
}
