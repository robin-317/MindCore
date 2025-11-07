package com.heima.chickenhousebackend.service.Impl;

import com.heima.chickenhousebackend.mapper.TextMapper;
import com.heima.chickenhousebackend.pojo.Post;
import com.heima.chickenhousebackend.pojo.User;
import com.heima.chickenhousebackend.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextServiceImpl implements TextService {

    @Autowired
    private TextMapper textMapper;

    //根据文章id获取发帖人信息
    @Override
    public User getById(Post post) {
        return textMapper.getById(post);
    }

    //根据文章id获取文章信息
    @Override
    public Post getContentById(Long id) {
        return textMapper.getContentById(id);
    }

    //根据用户id获取用户文章展示的数据
    @Override
    public List<Post> getAllPassageListById(Long id) {
        return textMapper.getAllPassageListById(id);
    }

    //根据用户id获取用户问题展示的数据
    @Override
    public List<Post> getAllProbemListById(Long id) {
        return textMapper.getAllProblemListById(id);
    }
}
