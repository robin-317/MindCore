package com.heima.chickenhousebackend.mapper;

import com.heima.chickenhousebackend.pojo.History;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HistoryMapper {

    //存入历史记录信息
    void insertHistory(History history);

    //获取用户的今天的观看历史
    List<History> getToday(Integer id);
    //获取用户的昨天的观看历史
    List<History> getYesterday(Integer id);
    //获取用户的近一周的观看历史
    List<History> getWeek(Integer id);

    //获取用户的今天的观看历史1
    List<History> getToday1(Integer id);
    //获取用户的昨天的观看历史1
    List<History> getYesterday1(Integer id);
    //获取用户的近一周的观看历史1
    List<History> getWeek1(Integer id);

    //获取用户的今天的观看历史2
    List<History> getToday2(Integer id);
    //获取用户的昨天的观看历史2
    List<History> getYesterday2(Integer id);
    //获取用户的近一周的观看历史2
    List<History> getWeek2(Integer id);

    //获取最近一次的历史记录
    History getLatest();

    List<History> getAll(int id);
}
