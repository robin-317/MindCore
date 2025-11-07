package com.heima.chickenhousebackend.controller;

import com.heima.chickenhousebackend.pojo.Post;
import com.heima.chickenhousebackend.pojo.Result;
import com.heima.chickenhousebackend.pojo.Video;
import com.heima.chickenhousebackend.service.UserService;
import com.heima.chickenhousebackend.utils.AliYunOssPera;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/post")
public class UploadController {


    private static final Logger log = LoggerFactory.getLogger(UploadController.class);

    @Autowired
    private AliYunOssPera aliYunOssPera;
    @Autowired
    private UserService userService;


    //视频上传
    @PostMapping("/uploadVideo")
    public Result uploadVideo(@RequestParam("file") MultipartFile file) throws Exception {
        log.info("视频上传:{}", file.getOriginalFilename());

        //将文件交给OSS存储管理
        String url =  aliYunOssPera.upload(file.getBytes(),file.getOriginalFilename());
        log.info("视频上传的URL为：{}",url);
        return Result.success(url);
    }

    //视频封面上传
    @PostMapping("/uploadVImg")
    public Result uploadVImg(@RequestParam("file") MultipartFile file) throws Exception {
        log.info("视频封面上传:{}", file.getOriginalFilename());

        //将文件交给OSS存储管理
        String url =  aliYunOssPera.upload(file.getBytes(),file.getOriginalFilename());
        log.info("视频封面上传的URL为：{}",url);
        return Result.success(url);
    }

    //发布内容上传
    @PostMapping("/postVideo")
    public Result postVideo(@RequestBody Video video){
        log.info("上传发布内容:{}",video);
        userService.postInformation(video);
        return Result.success();
    }

    //发布文章内容
    @PostMapping("/pagePost")
    public Result pagePost(@RequestBody Post post){
        log.info("发布文章内容：{}",post);
        userService.postText(post);
        return Result.success();
    }

    //封面接口上传
    @PostMapping("/uploadTImg")
    public Result uploadTImg(@RequestParam("file") MultipartFile file) throws Exception {
        log.info("文章封面上传:{}", file.getOriginalFilename());
        //将文件交给OSS存储管理
        String url =  aliYunOssPera.upload(file.getBytes(),file.getOriginalFilename());
        log.info("文章封面上传的URL为：{}",url);
        return Result.success(url);
    }

    //文章内插入图片
    @PostMapping("/pageImgPost")
    public Result pageImgPost(@RequestParam("file") MultipartFile file) throws Exception {
        log.info("文章内图片上传:{}", file.getOriginalFilename());
        //将文件交给OSS存储管理
        String url =  aliYunOssPera.upload(file.getBytes(),file.getOriginalFilename());
        log.info("文章内图片上传的URL为：{}",url);
        return Result.success(url);
    }

    //上传头像
    @PostMapping("/userAvatar")
    public Result getUserAvatar(@RequestParam("file") MultipartFile file)throws Exception {
        log.info("上传头像:{}", file.getOriginalFilename());
        String url =  aliYunOssPera.upload(file.getBytes(),file.getOriginalFilename());
        log.info("文章内图片上传的URL为：{}",url);
        return Result.success(url);
    }

}
