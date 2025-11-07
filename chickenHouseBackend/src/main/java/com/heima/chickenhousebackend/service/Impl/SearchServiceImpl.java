package com.heima.chickenhousebackend.service.Impl;

import com.heima.chickenhousebackend.mapper.SearchMapper;
import com.heima.chickenhousebackend.pojo.*;
import com.heima.chickenhousebackend.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private SearchMapper searchMapper;

    //搜索框，搜索相关内容
    @Override
    public List<Search> search(String describe) {
        return searchMapper.search(describe);
    }
    @Override
    public List<Search> search_1(String describe) {
        return searchMapper.search_1(describe);
    }

    //模糊搜索视频标题
    @Override
    public List<Video> searchVideo(String searchInfo) {
        return searchMapper.searchVideo(searchInfo);
    }

    //模糊搜索文章标题
    @Override
    public List<Post> searchMessage(String searchInfo) {
        return searchMapper.searchMessage(searchInfo);
    }

    //模糊搜索问题标题
    @Override
    public List<Question> searchQuestion(String searchInfo) {
        return searchMapper.searchQuestion(searchInfo);
    }

    //模糊搜索用户
    @Override
    public List<User> searchUser(String searchInfo) {
        return searchMapper.searchUser(searchInfo);
    }
}
