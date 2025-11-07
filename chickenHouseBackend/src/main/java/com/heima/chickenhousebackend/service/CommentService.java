package com.heima.chickenhousebackend.service;

import com.heima.chickenhousebackend.pojo.*;

import java.util.List;

public interface CommentService {
    //获取根评论的评论列表
    PageResult<CommentVideo> pageVC(PageVideoComment page);

    //根据父评论id和所属视频id查询子评论
    List<CommentVideo> getChildren(CommentVideo commentVideo);

    //根据id查询评论信息
    CommentVideo getById(CommentVideo commentVideo);

    //发布评论信息
    void addComment(CommentVideo commentVideo);

    //分页获取文章顶层评论信息
    PageResult<CommentPassage> getPassageTopComment(PagePassageComment pagePassageComment);

    //根据父评论id和所属文章id查询子评论列表
    List<CommentPassage> getChildrenPassage(CommentPassage commentPassage);

    //发布文章评论信息
    void addCommentPassage(CommentPassage commentPassage);

    //分页获取问题顶层评论信息
    PageResult<CommentProblem> pageGetTopProblemComment(PageProblemComment pageProblemComment);

    //发布问题评论
    void addProblemComment(CommentProblem commentProblem);

    //根据父评论id和所属问题id查询子评论
    List<CommentProblem> getChildrenProblem(CommentProblem commentProblem);
}
