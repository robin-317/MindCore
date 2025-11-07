package com.heima.chickenhousebackend.service;

import com.heima.chickenhousebackend.pojo.*;

import java.util.List;

public interface SearchService {

    //搜索框，搜索相关内容
    List<Search> search(String describe);
    List<Search> search_1(String describe);

    //模糊搜索视频标题
    List<Video> searchVideo(String searchInfo);

    //模糊搜索文章标题
    List<Post> searchMessage(String searchInfo);

    //模糊搜索问题标题
    List<Question> searchQuestion(String searchInfo);

    //模糊搜索用户
    List<User> searchUser(String searchInfo);
}
