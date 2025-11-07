package com.heima.chickenhousebackend.service.Impl;

import com.heima.chickenhousebackend.mapper.VideoMapper;
import com.heima.chickenhousebackend.pojo.Video;
import com.heima.chickenhousebackend.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    //根据用户id获取用户视频展示的数据
    @Override
    public List<Video> getAllVideoListById(Long id) {
        return videoMapper.getAllVideoListById(id);
    }
}
