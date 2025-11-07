package com.heima.chickenhousebackend.mapper;

import com.heima.chickenhousebackend.pojo.Video;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoMapper {
    //根据用户id获取用户视频展示的数据
    List<Video> getAllVideoListById(Long id);
}
