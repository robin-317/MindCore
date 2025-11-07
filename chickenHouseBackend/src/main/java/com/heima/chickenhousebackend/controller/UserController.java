package com.heima.chickenhousebackend.controller;

import com.heima.chickenhousebackend.pojo.*;
import com.heima.chickenhousebackend.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.lang.module.Configuration;
import java.util.List;

@RestController
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    //查询部分视频
    @GetMapping("/home/getVideoList")
    public Result getVideo() {
        log.info("查询部分视频");
        List<Video> list = userService.listVideo();
        return Result.success(list);
    }

    //查询所有视频
    @GetMapping("/home/getAllVideoList")
    public Result getVideo1() {
        log.info("查询部分视频1");
        List<Video> list = userService.listVideo_1();
        return Result.success(list);
    }

    //根据id查询视频
    @GetMapping("/getVideoInfo/{id}")
    public Result getVideoById(@PathVariable int id) {
        log.info("根据id查询视频:{}",id);
        Video video = userService.getUrlById(id);
        return Result.success(video);
    }

    //查询部分文章
    @GetMapping("/home/getHostTextList")
    public Result getText() {
        log.info("查询部分文章");
        List<Post> list = userService.listText();
        return Result.success(list);
    }

    //查询所有文章
    @GetMapping("/home/getAllPassageList")
    public Result getText2() {
        log.info("查询部分文章1");
        List<Post> list = userService.listText_1();
        return Result.success(list);
    }

    // 根据视频中user_id查询用户信息
    @PostMapping("/video/WritterMS")
    public Result getInfoByUserId(@RequestBody Video video) {
        log.info("根据视频中user_id查询用户信息:{}",video.getUserId());
        User info = userService.getByUserId(video);
        return Result.success(info);
    }

    //根据用户id查询用户信息
    @GetMapping("/user/{id}")
    public Result getUserInfoById(@PathVariable Integer id) {
        log.info("根据用户id查询用户信息:{}",id);
        User info = userService.getUserInfoById(id);
        return Result.success(info);
    }

    //分页查询，返回每一页的数据
    @PostMapping("/pagination")
    public Result page(@RequestBody Page page) {
        if(page.getType() == 1){
            log.info("分页查询'视频'数据:{},",page);
            PageResult<Video> pageResult = userService.pageVideo(page);
            return Result.success(pageResult);
        }else if(page.getType() == 2){
            log.info("分页查询'文章'数据:{},",page);
            PageResult<Post> pageResult = userService.pageText(page);
            return Result.success(pageResult);
        }else{
            log.info("分页查询'问题'数据:{}",page);
            PageResult<Question> pageResult = userService.pageQuestion(page);
            return Result.success(pageResult);
        }
    }

    //返回文章、视频、问题的总数量
    @GetMapping("/center/totalCount/{id}")
    public Result getTotalCountInfo(@PathVariable Integer id) {
        log.info("返回文章、视频、问题的总数量,{}",id);
        TotalCount totalCount = userService.getTotalCount(id);
        return Result.success(totalCount);
    }

    //分页查询，返回每一页的数据(限定当前用户)
    @PostMapping("/center/pagination")
    public Result page_1(@RequestBody Page page) {
        if(page.getType() == 1){
            log.info("分页查询'视频'数据(限定当前用户):{}",page.getUserId());
            PageResult<Video> pageResult = userService.pageVideo_1(page);
            return Result.success(pageResult);
        }else if(page.getType() == 2){
            log.info("分页查询'文章'数据(限定当前用户):{}",page.getUserId());
            PageResult<Post> pageResult = userService.pageText_1(page);
            return Result.success(pageResult);
        }else{
            log.info("分页查询'问题'数据(限定当前用户):{}",page.getUserId());
            PageResult<Question> pageResult = userService.pageQuestion_1(page);
            return Result.success(pageResult);
        }
    }

    //修改用户信息
    @PutMapping("/user/changeInfo/{id}")
    public Result changeInfo(@PathVariable Integer id, @RequestBody User user) {
        log.info("修改用户信息:{},{}",id,user);
        userService.changeInfo(id,user);
        return Result.success();
    }

/*    //根据id获取用户文章展示的数据
    @GetMapping("/user/getAllPassageList/{id}")
    public Result getUserPassageList(@PathVariable Integer id) {
        log.info("获取用户文章展示的数据:{}",id);
        List<Post> list = userService.getUserPassage(id);
        return Result.success(list);
    }

    //根据id获取用户视频展示的数据
    @GetMapping("/user/getAllVideoList/{id}")
    public Result getUserVideoList(@PathVariable Integer id) {
        log.info("根据id获取用户视频展示的数据:{}",id);
        List<Video> list = userService.getUserVideo(id);
        return Result.success(list);
    }

    //根据id获取用户问题展示的数据
    @GetMapping("/user/getAllProblemList/{id}")
    public Result getUserProblemList(@PathVariable Integer id) {
        log.info("根据id获取用户问题展示的数据:{}",id);
        List<Question> list = userService.getUserQuestion(id);
        return Result.success(list);
    }*/

    //根据id获取用户的文章收藏1
    @GetMapping("/user/getPassageStarList/{id}")
    public Result getPassageStarList(@PathVariable Integer id) {
        log.info("根据id获取用户的文章收藏:{}",id);
        List<Post> list = userService.getUserPassage_1(id);
        return Result.success(list);
    }

    //根据id获取用户的视频收藏1
    @GetMapping("/user/getVideoStarList/{id}")
    public Result getVideoStarList(@PathVariable Integer id) {
        log.info("根据id获取用户的视频收藏:{}",id);
        List<Video> list = userService.getUserVideo_1(id);
        return Result.success(list);
    }

    //根据id获取用户的问题收藏1
    @GetMapping("/user/getProblemStarList/{id}")
    public Result getProblemStarList(@PathVariable Integer id) {
        log.info("根据id获取用户的问题收藏:{}",id);
        List<Question> list = userService.getUserQuestion_1(id);
        return Result.success(list);
    }

    //根据用户id查询用户收藏的数量
    @GetMapping("/center/starCount/{id}")
    public Result getAllStarCount(@PathVariable Integer id) {
        log.info("根据用户id查询用户收藏的数量:{}",id);
        Integer count = userService.getAllStarCount(id);
        return Result.success(count);
    }

    //获取所有用户
    @GetMapping("/user/getAll")
    public Result getAll() {
        log.info("获取所有用户");
        List<User> users = userService.getAllUsers();
        return Result.success(users);
    }


}
