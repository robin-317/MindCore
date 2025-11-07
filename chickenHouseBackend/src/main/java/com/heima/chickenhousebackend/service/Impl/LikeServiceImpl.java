package com.heima.chickenhousebackend.service.Impl;

import com.heima.chickenhousebackend.mapper.LikeMapper;
import com.heima.chickenhousebackend.pojo.Like;
import com.heima.chickenhousebackend.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeServiceImpl implements LikeService {

    @Autowired
    private LikeMapper likeMapper;

    //是否点赞和收藏
    @Override
    public Like starAndLike(Like like) {
        return likeMapper.starAndLike(like);
    }

    //点赞
    @Override
    public void addLike(Like like) {
        likeMapper.addLike(like);
    }

    //初始化点赞/收藏数据
    @Override
    public void init(Like like) {
        Like info = likeMapper.starAndLike(like);
        if(info == null) {
            likeMapper.init(like);
        }
    }

    //收藏
    @Override
    public void addStart(Like like) {
        likeMapper.addStart(like);
    }
    //添加到视频收藏列表
    @Override
    public void addToStarList(Like like) {
        likeMapper.addToStarList(like);
    }

    //文章点赞
    @Override
    public void addLikePassage(Like like) {
        likeMapper.addLikePassage(like);
    }

    //收藏文章
    @Override
    public void addStartPassage(Like like) {
        likeMapper.addStartPassage(like);
    }
    //添加到文章收藏列表
    @Override
    public void addToStarPassageList(Like like) {
        likeMapper.addToPassageList(like);
    }

    //点赞问题
    @Override
    public void toLikeProblem(Like like) {
        likeMapper.addLikeProblem(like);
    }
    //收藏问题
    @Override
    public void toStarProblem(Like like) {
        likeMapper.addStartProblem(like);
    }
    //添加到问题收藏列表
    @Override
    public void addToStarProblem(Like like) {
        likeMapper.addToProblemList(like);
    }

}
