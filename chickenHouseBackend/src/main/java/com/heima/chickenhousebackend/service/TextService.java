package com.heima.chickenhousebackend.service;

import com.heima.chickenhousebackend.pojo.Post;
import com.heima.chickenhousebackend.pojo.User;

import java.util.List;

public interface TextService {
    //根据文章id获取发帖人信息
    User getById(Post post);

    //根据文章id获取文章信息
    Post getContentById(Long id);

    //根据用户id获取用户文章展示的数据
    List<Post> getAllPassageListById(Long id);

    //根据用户id获取用户问题展示的数据
    List<Post> getAllProbemListById(Long id);
}
