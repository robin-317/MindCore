package com.heima.chickenhousebackend.controller;

import com.heima.chickenhousebackend.pojo.History;
import com.heima.chickenhousebackend.pojo.Result;
import com.heima.chickenhousebackend.service.HistoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Character.getType;

@RestController
public class HistoryController {

    private static final Logger log = LoggerFactory.getLogger(HistoryController.class);

    @Autowired
    private HistoryService historyService;


    //todo
    //存入历史记录信息
    @PostMapping("/history/insert")
    public Result insertHistory(@RequestBody History history) {
        log.info("存入历史记录信息:{}",history);
        historyService.insertHistory(history);
        return Result.success();
    }

    // ----------------------------------视频----------------------------------
    //获取用户的今天的观看历史
    @GetMapping("/history/getInfoTodayVideo/{id}")
    public Result getInfoToday(@PathVariable Integer id) {
        log.info("获取用户的今天的观看历史:{}",id);
        List<History> lists = historyService.getTodayHistory(id);
        return Result.success(lists);
    }
/*    //获取用户的昨天的观看历史
    @GetMapping("/history/getInfoYesterdayVideo/{id}")
    public Result getInfoYesterday(@PathVariable Integer id) {
        log.info("获取用户的昨天的观看历史:{}",id);
        List<History> lists = historyService.getYesterdayHistory(id);
        return Result.success(lists);
    }
    //获取用户的近一周的观看历史
    @GetMapping("/history/getInfoWeekVideo/{id}")
    public Result getInfoWeek(@PathVariable Integer id) {
        log.info("获取用户的近一周的观看历史:{}",id);
        List<History> lists = historyService.getWeekHistory(id);
        return Result.success(lists);
    }*/


    // ----------------------------------文章----------------------------------
    //获取用户的今天的观看历史1
    @GetMapping("/history/getInfoTodayPassage/{id}")
    public Result getInfoToday1(@PathVariable Integer id) {
        log.info("获取用户的今天的观看历史1:{}",id);
        List<History> lists = historyService.getTodayHistory1(id);
        return Result.success(lists);
    }
/*    //获取用户的昨天的观看历史1
    @GetMapping("/history/getInfoYesterdayPassage/{id}")
    public Result getInfoYesterday1(@PathVariable Integer id) {
        log.info("获取用户的昨天的观看历史1:{}",id);
        List<History> lists = historyService.getYesterdayHistory1(id);
        return Result.success(lists);
    }
    //获取用户的近一周的观看历史1
    @GetMapping("/history/getInfoWeekPassage/{id}")
    public Result getInfoWeek1(@PathVariable Integer id) {
        log.info("获取用户的近一周的观看历史1:{}",id);
        List<History> lists = historyService.getWeekHistory1(id);
        return Result.success(lists);
    }*/

    // ----------------------------------问题----------------------------------
    //获取用户的今天的观看历史2
    @GetMapping("/history/getInfoTodayProblem/{id}")
    public Result getInfoToday2(@PathVariable Integer id) {
        log.info("获取用户的今天的观看历史2:{}",id);
        List<History> lists = historyService.getTodayHistory2(id);
        return Result.success(lists);
    }
/*    //获取用户的昨天的观看历史2
    @GetMapping("/history/getInfoYesterdayProblem/{id}")
    public Result getInfoYesterday2(@PathVariable Integer id) {
        log.info("获取用户的昨天的观看历史2:{}",id);
        List<History> lists = historyService.getYesterdayHistory2(id);
        return Result.success(lists);
    }
    //获取用户的近一周的观看历史2
    @GetMapping("/history/getInfoWeekProblem/{id}")
    public Result getInfoWeek2(@PathVariable Integer id) {
        log.info("获取用户的近一周的观看历史2:{}",id);
        List<History> lists = historyService.getWeekHistory2(id);
        return Result.success(lists);
    }*/

}
