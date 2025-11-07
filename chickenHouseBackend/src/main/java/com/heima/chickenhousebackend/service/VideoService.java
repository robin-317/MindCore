package com.heima.chickenhousebackend.service;

import com.heima.chickenhousebackend.pojo.Video;

import java.util.List;

public interface VideoService {
    //根据用户id获取用户视频展示的数据
    List<Video> getAllVideoListById(Long id);
}
