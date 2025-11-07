package com.heima.chickenhousebackend.service.Impl;


import com.heima.chickenhousebackend.mapper.UserMapper;
import com.heima.chickenhousebackend.pojo.*;
import com.heima.chickenhousebackend.service.UserService;
import com.heima.chickenhousebackend.utils.JwtUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    //登录
    @Override
    public LoginInfo login(User user) {
        //查询是否存在用户信息
        User u = userMapper.login(user);
        if (u != null) {
            log.info("登录成功！用户信息为：{}",u);
            //生成JWT令牌
            Map<String ,Object> claims = new HashMap<>();
            claims.put("id",u.getId());
            claims.put("username",u.getUsername());
            String jwt = JwtUtils.generateToken(claims);
            return new LoginInfo(u.getId(),u.getUsername(),jwt);
        }
        return null;
        //return userMapper.login(user);
    }
    @Override
    public User getInfo(User user) {
        return userMapper.login(user);
    }

    //注册
    @Override
    public void register(User user) {
        userMapper.register(user);
    }
    //上传发布内容
    @Override
    public void postInformation(Video video) {
        video.setCreateTime(LocalDateTime.now());
        video.setLikeCount(0L);
        video.setStart(0L);
        userMapper.postInformation(video);
    }
    //发布文章
    @Override
    public void postText(Post post) {
        post.setCreateTime(LocalDateTime.now());
        post.setLikeCount(0L);
        userMapper.postText(post);
    }
    //TODO
    //查询部分视频
    @Override
    public List<Video> listVideo() {
        return userMapper.listVideo();
    }

    //查询部分文章
    @Override
    public List<Post> listText() {
        return userMapper.listText();
    }

    //跟据user_id查询用户信息
    @Override
    public User getByUserId(Video video) {
        return userMapper.getByUserId(video);
    }

    //根据用户id查询用户信息
    @Override
    public User getUserInfoById(Integer id) {
        return userMapper.getUserInfoById(id);
    }

    //查询部分视频_1
    @Override
    public List<Video> listVideo_1() {
        return userMapper.listVideo_1();
    }

    //查询部分文章_1
    @Override
    public List<Post> listText_1() {
        return userMapper.listText_1();
    }


    //分页查询视频
    @Override
    public PageResult<Video> pageVideo(Page page) {

        //1、调用mapper接口查询总记录数
        Long total = userMapper.count1();

        //2、调用mapper接口，查询结果列表
        Integer start = (page.getPage() - 1) * page.getPageSize();
        List<Video> results = userMapper.pageVideo(start,page);

        //3、封装结果到PageResult
        return new PageResult<Video>(total, results);

    }
    //分页查询文章
    @Transactional(rollbackFor = {Exception.class})
    @Override
    public PageResult<Post> pageText(Page page) {

        //1、调用mapper接口查询总记录数
        Long total = userMapper.count();

        //2、调用mapper接口，查询结果列表
        Integer start = (page.getPage() - 1) * page.getPageSize();
        List<Post> results = userMapper.pageText(start,page);

        //3、封装结果到PageResult
        return new PageResult<Post>(total, results);
    }
    //分页查询问题
    @Override
    public PageResult<Question> pageQuestion(Page page) {
        Long total = userMapper.count2();
        Integer start = (page.getPage() - 1) * page.getPageSize();
        List<Question> list = userMapper.pageProblem(start,page);
        return new PageResult<Question>(total,list);
    }

    //根据id查询视频url
    @Override
    public Video getUrlById(Integer id) {
        return userMapper.getUrlById(id);
    }

    //返回文章、视频、问题的总数量
    @Override
    public TotalCount getTotalCount(Integer id) {
        return userMapper.getTotalCount(id);
    }

    //分页查询，返回每一页的数据(限定当前用户)
    @Override
    public PageResult<Video> pageVideo_1(Page page) {
        //1、调用mapper接口查询总记录数
        Long total = userMapper.count_1(page);
        //2、调用mapper接口查询结果列表
        Integer start = (page.getPage() - 1) * page.getPageSize();
        List<Video> results = userMapper.pageVideo_1(start,page);
        //3、封装结果到PageResult
        return new PageResult<>(total, results);
    }
    //分页查询，返回每一页的文章(限定当前用户)
    @Override
    public PageResult<Post> pageText_1(Page page) {
        //1、调用mapper接口查询总记录数
        Long total = userMapper.count_2(page);
        //2、调用mapper接口查询结果列表
        Integer start = (page.getPage() - 1) * page.getPageSize();
        List<Post> results = userMapper.pageText_1(start,page);
        //3、封装结果到PageResult
        return new PageResult<>(total, results);
    }
    //分页查询，返回每一页的问题(限定当前用户)
    @Override
    public PageResult<Question> pageQuestion_1(Page page) {
        Long total = userMapper.count_3(page);
        Integer start = (page.getPage() - 1) * page.getPageSize();
        List<Question> list = userMapper.getUserProblem_1(start,page);
        return new PageResult<>(total, list);
    }

    //修改用户信息
    @Override
    public void changeInfo(Integer id, User user) {
        userMapper.changeInfo(id, user);
    }

    //根据id获取用户文章展示的数据
    @Override
    public List<Post> getUserPassage(Integer id) {
        return userMapper.getUserPassage(id);
    }

    //根据id获取用户视频展示的数据
    @Override
    public List<Video> getUserVideo(Integer id) {
        return userMapper.getUserVideo(id);
    }

    //根据id获取用户问题展示的数据
    @Override
    public List<Question> getUserQuestion(Integer id) {
        return userMapper.getUserProblem(id);
    }

    //根据用户id获取用户的文章收藏1
    @Override
    public List<Post> getUserPassage_1(Integer id) {
        return userMapper.getUserPassage_1(id);
    }

    //根据id获取用户的视频收藏1
    @Override
    public List<Video> getUserVideo_1(Integer id) {
        return userMapper.getUserVideo_1(id);
    }

    //根据id获取用户的问题收藏1
    @Override
    public List<Question> getUserQuestion_1(Integer id) {
        return userMapper.getUserQuestion_1(id);
    }

    //根据用户id查询用户收藏的数量
    @Override
    public Integer getAllStarCount(Integer id) {
        return userMapper.getAllCount(id);
    }

    //获取所有用户
    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }


}
