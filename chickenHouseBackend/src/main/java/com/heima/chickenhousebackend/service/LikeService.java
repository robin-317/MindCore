package com.heima.chickenhousebackend.service;

import com.heima.chickenhousebackend.pojo.Like;

public interface LikeService {
    //是否点赞和收藏
    Like starAndLike(Like like);

    //初始化点赞/收藏数据
    void init(Like like);

    //点赞视频
    void addLike(Like like);
    //收藏视频
    void addStart(Like like);
    //添加到视频收藏列表
    void addToStarList(Like like);

    //文章点赞
    void addLikePassage(Like like);
    //收藏文章
    void addStartPassage(Like like);
    //添加到文章收藏列表
    void addToStarPassageList(Like like);

    //点赞问题
    void toLikeProblem(Like like);
    //收藏问题
    void toStarProblem(Like like);
    //添加到问题收藏列表
    void addToStarProblem(Like like);
}
