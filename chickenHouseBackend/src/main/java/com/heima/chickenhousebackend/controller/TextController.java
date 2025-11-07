package com.heima.chickenhousebackend.controller;

import com.heima.chickenhousebackend.pojo.Post;
import com.heima.chickenhousebackend.pojo.Result;
import com.heima.chickenhousebackend.pojo.User;
import com.heima.chickenhousebackend.service.TextService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TextController {
    private static final Logger log = LoggerFactory.getLogger(TextController.class);

    @Autowired
    private TextService textService;

    //根据文章id获取发帖人信息
    @PostMapping("/passage/WritterMS")
    public Result getPostInfoById(@RequestBody Post post){
        log.info("根据文章id获取发帖人信息:{}",post.getUserId());
        User user = textService.getById(post);
        return Result.success(user);
    }

    //根据文章id获取文章信息
    @GetMapping("/getPassageInfo/{id}")
    public Result getPassageInfoById(@PathVariable("id") Long id){
        log.info("根据文章id获取文章信息:{}",id);
        Post post = textService.getContentById(id);
        return Result.success(post);
    }


    //根据用户id获取用户文章展示的数据
    @GetMapping("/user/getAllPassageList/{id}")
    public Result getAllPassageList(@PathVariable("id") Long id){
        log.info("根据用户id获取用户文章展示的数据:{}",id);
        List<Post> postList = textService.getAllPassageListById(id);
        return Result.success(postList);
    }

    //根据用户id获取用户问题展示的数据
    @GetMapping("/user/getAllProblemList/{id}")
    public Result getAllProblemList(@PathVariable("id") Long id){
        log.info("根据用户id获取用户问题展示的数据:{}",id);
        List<Post> problemList = textService.getAllProbemListById(id);
        return Result.success(problemList);
    }

}
