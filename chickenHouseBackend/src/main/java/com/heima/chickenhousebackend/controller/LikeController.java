package com.heima.chickenhousebackend.controller;

import com.heima.chickenhousebackend.pojo.Like;
import com.heima.chickenhousebackend.pojo.Result;
import com.heima.chickenhousebackend.service.LikeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LikeController {

    private static final Logger log = LoggerFactory.getLogger(LikeController.class);
    @Autowired
    private LikeService likeService;

    //初始化点赞收藏情况
    @PostMapping("/initLike")
    public Result initLike(@RequestBody Like like){
        log.info("初始化点赞/收藏数据:{}",like);
        likeService.init(like);
        return Result.success();
    }

    //是否点赞/收藏
    @PostMapping("/startLike")
    public Result startLike(@RequestBody Like like){
        log.info("是否点赞：{}",like);
        Like info = likeService.starAndLike(like);
        System.out.println(info);
        return Result.success(info);
    }

    //点赞视频
    @PostMapping("/toLike")
    public Result toLike(@RequestBody Like like){
        log.info("点赞:{}",like);
        likeService.addLike(like);
        return Result.success();
    }
    //收藏视频
    @PostMapping("/toStart")
    public Result toStart(@RequestBody Like like){
        log.info("收藏：{}",like);
        likeService.addStart(like);
        likeService.addToStarList(like);
        return Result.success();
    }

    //文章点赞
    @PostMapping("/passage/toLike")
    public Result toLikePassage(@RequestBody Like like){
        log.info("文章点赞:{}",like);
        likeService.addLikePassage(like);
        return Result.success();
    }
    //收藏文章
    @PostMapping("/passage/toStart")
    public Result toStartPassage(@RequestBody Like like){
        log.info("收藏文章：{}",like);
        likeService.addStartPassage(like);
        likeService.addToStarPassageList(like);
        return Result.success();
    }

    //点赞问题
    @PostMapping("/problem/toLike")
    public Result toLikeProblem(@RequestBody Like like){
        log.info("点赞问题：{}",like);
        likeService.toLikeProblem(like);
        return Result.success();
    }
    //收藏问题
    @PostMapping("/problem/toStar")
    public Result toStarProblem(@RequestBody Like like){
        log.info("收藏问题:{}",like);
        likeService.toStarProblem(like);
        likeService.addToStarProblem(like);
        return Result.success();
    }

}
