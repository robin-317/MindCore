package com.heima.chickenhousebackend.mapper;

import com.heima.chickenhousebackend.pojo.Post;
import com.heima.chickenhousebackend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TextMapper {
    //根据文章id获取发帖人信息
    User getById(Post post);

    //根据文章id获取文章信息
    Post getContentById(Long id);

    //根据用户id获取用户文章展示的数据
    List<Post> getAllPassageListById(Long id);

    //根据用户id获取用户问题展示的数据
    List<Post> getAllProblemListById(Long id);
}
