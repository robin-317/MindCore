package com.heima.chickenhousebackend.controller;

import com.heima.chickenhousebackend.pojo.Result;
import com.heima.chickenhousebackend.pojo.Video;
import com.heima.chickenhousebackend.service.VideoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoController {

    private static final Logger log = LoggerFactory.getLogger(VideoController.class);
    @Autowired
    private VideoService videoService;

    //根据用户id获取用户视频展示的数据
    @GetMapping("/user/getAllVideoList/{id}")
    public Result getAllVideoList(@PathVariable Long id) {
        log.info("根据用户id获取用户视频展示的数据:{}",id);
        List<Video> videoList = videoService.getAllVideoListById(id);
        return Result.success(videoList);
    }
}
