package com.heima.chickenhousebackend.service.Impl;

import com.heima.chickenhousebackend.mapper.QuestionMapper;
import com.heima.chickenhousebackend.pojo.Page;
import com.heima.chickenhousebackend.pojo.PageResult;
import com.heima.chickenhousebackend.pojo.Question;
import com.heima.chickenhousebackend.pojo.User;
import com.heima.chickenhousebackend.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;

    //发布问题
    @Override
    public void postQuestion(Question question) {
        questionMapper.postQuestion(question);
    }

    //根据id获取问题发帖人的信息
    @Override
    public User getUserById(int id) {
        return questionMapper.getUserById(id);
    }

    //获取所有问题
    @Override
    public List<Question> getList() {
        return questionMapper.getList();
    }

    //分页查询所有问题
    @Override
    public PageResult<Question> pageAllQuestion(Page page) {
        Long total = questionMapper.countAll();
        Integer start = (page.getPage() - 1) * page.getPageSize();
        List<Question> list = questionMapper.pageAll(start,page);
        return new PageResult<>(total,list);

    }

    //根据id获取问题贴的详情内容
    @Override
    public Question getInfoById(int id) {
        return questionMapper.getInfoById(id);
    }

    //根据id修改问题已解决
    @Override
    public void console(Question question) {
        questionMapper.console(question);
    }

    //根据用户id查询发布的问题中，已解决和为解决的问题的数量
    @Override
    public List<Map<String, Object>> getConsoleCount(int id) {
        return questionMapper.getConsoleCount(id);
    }
}
