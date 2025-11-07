package com.heima.chickenhousebackend.service.Impl;

import com.heima.chickenhousebackend.mapper.CommentMapper;
import com.heima.chickenhousebackend.pojo.*;
import com.heima.chickenhousebackend.service.CommentService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    //获取根评论的评论列表
    @Override
    public PageResult<CommentVideo> pageVC(PageVideoComment page) {
        if(page.getSize()==null){
            return null;
        }
        //1、调用mapper接口查询总记录数
        Long total = commentMapper.count();

        //2、调用mapper接口，查询结果列表
        Integer start = (page.getSize() - 1) * page.getPageSize();
        List<CommentVideo> results = commentMapper.pageVC(start,page);

        //3、封装结果到PageResult
        return new PageResult<CommentVideo>(total, results);
    }

    //根据父评论id和所属视频id查询子评论
    @Override
    public List<CommentVideo> getChildren(CommentVideo commentVideo) {
        return commentMapper.getChildren(commentVideo);
    }

    //根据根/父/视频id查询评论信息
    @Override
    public CommentVideo getById(CommentVideo commentVideo) {
        return commentMapper.getById(commentVideo);
    }

    //发布评论信息
    @Override
    public void addComment(CommentVideo commentVideo) {
        commentVideo.setCreatedAt(LocalDateTime.now());
        commentMapper.addComment(commentVideo);
    }

    //分页获取文章顶层评论信息
    @Override
    public PageResult<CommentPassage> getPassageTopComment(PagePassageComment pagePassageComment) {
        if(pagePassageComment.getSize()==null){
            return null;
        }
        Long total = commentMapper.countP();

        Integer start = (pagePassageComment.getSize() - 1) * pagePassageComment.getPageSize();

        List<CommentPassage> list = commentMapper.getTopPassageComment(start,pagePassageComment);

        return new PageResult<>(total, list);
    }

    //根据父评论id和所属文章id查询子评论列表
    @Override
    public List<CommentPassage> getChildrenPassage(CommentPassage commentPassage) {
        return commentMapper.getChildrenPassage(commentPassage);
    }

    //发布文章评论信息
    @Override
    public void addCommentPassage(CommentPassage commentPassage) {
        commentPassage.setCreatedAt(LocalDateTime.now());
        commentMapper.addCommentPassage(commentPassage);
    }

    //分页获取问题顶层评论信息
    @Override
    public PageResult<CommentProblem> pageGetTopProblemComment(PageProblemComment pageProblemComment) {
        if(pageProblemComment.getSize()==null){
            return null;
        }
        Long total = commentMapper.countProblem();

        Integer start = (pageProblemComment.getSize() - 1) * pageProblemComment.getPageSize();
        List<CommentProblem> list = commentMapper.pageProblem(start,pageProblemComment);
        return new PageResult<>(total, list);
    }

    //发布问题评论
    @Override
    public void addProblemComment(CommentProblem commentProblem) {
        commentProblem.setCreatedAt(LocalDateTime.now());
        commentMapper.addCommentProblem(commentProblem);
    }

    //根据父评论id和所属问题id查询子评论
    @Override
    public List<CommentProblem> getChildrenProblem(CommentProblem commentProblem) {
        return commentMapper.getChildrenProblem(commentProblem);
    }
}
