package com.heima.chickenhousebackend.service;

import com.heima.chickenhousebackend.pojo.History;

import java.util.List;

public interface HistoryService {

    //存入历史记录信息
    void insertHistory(History history);

    //获取用户的今天的观看历史
    List<History> getTodayHistory(Integer id);
    //获取用户的昨天的观看历史
    List<History> getYesterdayHistory(Integer id);
    //获取用户的近一周的观看历史
    List<History> getWeekHistory(Integer id);

    //获取用户的今天的观看历史1
    List<History> getTodayHistory1(Integer id);
    //获取用户的昨天的观看历史1
    List<History> getYesterdayHistory1(Integer id);
    //获取用户的近一周的观看历史1
    List<History> getWeekHistory1(Integer id);

    //获取用户的今天的观看历史2
    List<History> getTodayHistory2(Integer id);
    //获取用户的昨天的观看历史2
    List<History> getYesterdayHistory2(Integer id);
    //获取用户的近一周的观看历史2
    List<History> getWeekHistory2(Integer id);

}
