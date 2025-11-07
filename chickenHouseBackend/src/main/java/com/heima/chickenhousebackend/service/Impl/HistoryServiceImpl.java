package com.heima.chickenhousebackend.service.Impl;

import com.heima.chickenhousebackend.mapper.HistoryMapper;
import com.heima.chickenhousebackend.pojo.History;
import com.heima.chickenhousebackend.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    private HistoryMapper historyMapper;

    //存入历史记录信息
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void insertHistory(History history) {

        //获取最近一次的历史记录
        //History history1 = historyMapper.getLatest();

        historyMapper.insertHistory(history);
    }


    //获取用户的今天的观看历史
    @Override
    public List<History> getTodayHistory(Integer id) {
        return historyMapper.getToday(id);
    }
    //获取用户的昨天的观看历史
    @Override
    public List<History> getYesterdayHistory(Integer id) {
        return historyMapper.getYesterday(id);
    }
    //获取用户的近一周的观看历史
    @Override
    public List<History> getWeekHistory(Integer id) {
        return historyMapper.getWeek(id);
    }


    //获取用户的今天的观看历史1
    @Override
    public List<History> getTodayHistory1(Integer id) {
        return historyMapper.getToday1(id);
    }
    //获取用户的昨天的观看历史1
    @Override
    public List<History> getYesterdayHistory1(Integer id) {
        return historyMapper.getYesterday1(id);
    }
    //获取用户的近一周的观看历史1
    @Override
    public List<History> getWeekHistory1(Integer id) {
        return historyMapper.getWeek1(id);
    }


    //获取用户的今天的观看历史2
    @Override
    public List<History> getTodayHistory2(Integer id) {
        return historyMapper.getToday2(id);
    }
    //获取用户的昨天的观看历史2
    @Override
    public List<History> getYesterdayHistory2(Integer id) {
        return historyMapper.getYesterday2(id);
    }
    //获取用户的近一周的观看历史2
    @Override
    public List<History> getWeekHistory2(Integer id) {
        return historyMapper.getWeek2(id);
    }

}
