package com.heima.chickenhousebackend.controller;

import com.heima.chickenhousebackend.pojo.*;
import com.heima.chickenhousebackend.service.CommentService;
import org.apache.ibatis.annotations.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    private static final Logger log = LoggerFactory.getLogger(CommentController.class);

    @Autowired
    private CommentService commentService;

    //分页获取根评论的评论列表
    @PostMapping("/loadTopTopComment")
    public Result loadTopTopComment(@RequestBody PageVideoComment pageVideoComment) {
        log.info("分页查询根评论列表:{}",pageVideoComment);
        PageResult<CommentVideo> pageResult = commentService.pageVC(pageVideoComment);
        return Result.success(pageResult);
    }

    //根据父评论id和所属视频id查询子评论
    @PostMapping("/loadChildComment")
    public Result loadChildComment(@RequestBody CommentVideo commentVideo) {
        log.info("根据父评论id和所属视频id查询子评论:{}",commentVideo);
        List<CommentVideo> list = commentService.getChildren(commentVideo);
        return Result.success(list);
    }

    //根据根/父/视频id查询评论信息
    @PostMapping("/CommentInfoById")
    @Cacheable(cacheNames = "commentCache" , key = "#commentVideo")
    public Result getCommentById(@RequestBody CommentVideo commentVideo){
        log.info("根据根/父/视频id查询评论信息：{}",commentVideo);
        CommentVideo comment = commentService.getById(commentVideo);
        return Result.success(comment);
    }

    //发布视频评论信息
    @PostMapping("/postAddComment")
    @CacheEvict(cacheNames = "commentCache", allEntries = true)
    public Result addComment(@RequestBody CommentVideo commentVideo){
        log.info("发布评论信息:{}",commentVideo);
        commentService.addComment(commentVideo);
        return Result.success();
    }

    //分页获取文章顶层评论信息
    @PostMapping("/passage/loadTopTopComment")
    public Result getTopPassageComment(@RequestBody PagePassageComment pagePassageComment){
        log.info("分页查询文章顶层评论列表:{}",pagePassageComment);
        PageResult<CommentPassage> pageResult = commentService.getPassageTopComment(pagePassageComment);
        return Result.success(pageResult);
    }

    //根据父评论id和所属文章id查询子评论列表
    @PostMapping("/passage/loadChildComment")
    public Result loadTopPassageComment(@RequestBody CommentPassage commentPassage){
        log.info("根据父评论id和所属文章id查询子评论列表:{}",commentPassage);
        List<CommentPassage> list = commentService.getChildrenPassage(commentPassage);
        return Result.success(list);
    }

    //发布文章评论信息
    @PostMapping("/passage/postAddComment")
    public Result postAddComment(@RequestBody CommentPassage commentPassage){
        log.info("发布文章评论信息:{}",commentPassage);
        commentService.addCommentPassage(commentPassage);
        return Result.success();
    }

    //分页获取问题顶层评论信息
    @PostMapping("/problem/loadTopTopComment")
    public Result pageTopProblemComment(@RequestBody PageProblemComment pageProblemComment ){
        log.info("分页查询问题顶层评论列表:{}",pageProblemComment);
        PageResult<CommentProblem> pageResult =  commentService.pageGetTopProblemComment(pageProblemComment);
        return Result.success(pageResult);
    }

    //发布问题评论
    @PostMapping("/problem/postAddComment")
    public Result problemAddComment(@RequestBody CommentProblem commentProblem){
        log.info("发布问题评论：{}",commentProblem);
        commentService.addProblemComment(commentProblem);
        return Result.success();
    }

    //根据父评论id和所属问题id查询子评论
    @PostMapping("/problem/loadChildComment")
    public Result loadChildProblemComment(@RequestBody CommentProblem commentProblem){
        log.info("根据父评论id和所属问题id查询子评论:{}",commentProblem);
        List<CommentProblem> list = commentService.getChildrenProblem(commentProblem);
        System.out.println(list);
        return Result.success(list);
    }

    //

}
