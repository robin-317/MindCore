package com.heima.chickenhousebackend.controller;

import com.heima.chickenhousebackend.pojo.*;
import com.heima.chickenhousebackend.service.QuestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class QuestionController {

    private static final Logger log = LoggerFactory.getLogger(QuestionController.class);

    @Autowired
    private QuestionService questionService;

    //发布问题
    @PostMapping("/post/problemPost")
    public Result postQuestion(@RequestBody Question question) {
        log.info("发布问题：{}",question);
        questionService.postQuestion(question);
        return Result.success();
    }

    //根据id获取问题发帖人的信息
    @GetMapping("/problemWriter/{id}")
    public Result getProblemWriter(@PathVariable int id) {
        log.info("获取问题发帖人的信息：{}",id);
        User user = questionService.getUserById(id);
        return Result.success(user);
    }

    //获取所有问题
    @GetMapping("/home/getAllProblemList")
    public Result getAllProblemList() {
        log.info("获取所有问题");
        List<Question> list = questionService.getList();
        return Result.success(list);
    }

    //分页查询所有问题
    @PostMapping("/problem/pagination")
    public Result pageQuestion(@RequestBody Page page) {
        log.info("分页查询所有问题:{}",page);
        PageResult<Question> pageResults = questionService.pageAllQuestion(page);
        return Result.success(pageResults);
    }

    //根据id获取问题贴的详情内容
    @GetMapping("/getProblemInfo/{id}")
    public Result getProblemInfo(@PathVariable int id) {
        log.info("根据id获取问题的详细信息：{}",id);
        Question question = questionService.getInfoById(id);
        return Result.success(question);
    }

    //根据id修改问题已解决
    @PostMapping("/problem/console")
    public Result consoleQuestion(@RequestBody Question question) {
        log.info("解决问题：{}",question.getId());
        questionService.console(question);
        return Result.success();
    }

    //根据用户id查询发布的问题中，已解决和为解决的问题的数量
    @GetMapping("/center/consoleCount/{id}")
    public Result consoleCount(@PathVariable int id) {
        log.info("根据用户id查询发布的问题中，已解决和为解决的问题的数量：{}",id);
        List<Map<String,Object>> list = questionService.getConsoleCount(id);
        return Result.success(list);
    }

}
