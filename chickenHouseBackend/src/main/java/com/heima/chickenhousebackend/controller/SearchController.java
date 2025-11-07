package com.heima.chickenhousebackend.controller;

import com.heima.chickenhousebackend.pojo.*;
import com.heima.chickenhousebackend.service.SearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {

    private static final Logger log = LoggerFactory.getLogger(SearchController.class);
    @Autowired
    private SearchService searchService;

    //TODO
    //搜索框，搜索相关内容
    @GetMapping("/search/{describe}")
    public Result search(@PathVariable String describe){
        log.info("搜索框查询：{}",describe);
        List<Search> searches = searchService.search(describe);
        List<Search> searches1 = searchService.search_1(describe);
        // 合并两个结果集
        List<Search> combined = new ArrayList<>();
        if (searches != null) {
            combined.addAll(searches);
        }
        if (searches1 != null) {
            combined.addAll(searches1);
        }
        return Result.success(combined);
    }

    //模糊搜索视频标题
    @GetMapping("/search/video/{searchInfo}")
    public Result searchVideo(@PathVariable String searchInfo){
        log.info("搜索视频标题:{}",searchInfo);
        List<Video> video = searchService.searchVideo(searchInfo);
        return Result.success(video);
    }

    //模糊搜索文章标题
    @GetMapping("/search/passage/{searchInfo}")
    public Result searchMessage(@PathVariable String searchInfo){
        log.info("模糊搜索文章标题:{}",searchInfo);
        List<Post> postList = searchService.searchMessage(searchInfo);
        return Result.success(postList);
    }

    //模糊搜索问题标题
    @GetMapping("/search/problem/{searchInfo}")
    public Result searchProblem(@PathVariable String searchInfo){
        log.info("模糊搜索问题标题:{}",searchInfo);
        List<Question> questions = searchService.searchQuestion(searchInfo);
        return Result.success(questions);
    }

    //模糊搜索用户
    @GetMapping("/search/user/{searchInfo}")
    public Result searchUser(@PathVariable String searchInfo){
        log.info("模糊搜索用户:{}",searchInfo);
        List<User> users = searchService.searchUser(searchInfo);
        return Result.success(users);
    }

}
