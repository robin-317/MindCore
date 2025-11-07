package com.heima.chickenhousebackend.service;

import com.heima.chickenhousebackend.pojo.Page;
import com.heima.chickenhousebackend.pojo.PageResult;
import com.heima.chickenhousebackend.pojo.Question;
import com.heima.chickenhousebackend.pojo.User;

import java.util.List;
import java.util.Map;

public interface QuestionService {
    //发布问题
    void postQuestion(Question question);

    //根据id获取问题发帖人的信息
    User getUserById(int id);

    //获取所有问题
    List<Question> getList();

    //分页查询所有问题
    PageResult<Question> pageAllQuestion(Page page);

    //根据id获取问题贴的详情内容
    Question getInfoById(int id);

    //根据id修改问题已解决
    void console(Question question);

    //根据用户id查询发布的问题中，已解决和为解决的问题的数量
    List<Map<String, Object>> getConsoleCount(int id);
}
