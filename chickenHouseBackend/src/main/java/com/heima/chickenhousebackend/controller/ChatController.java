package com.heima.chickenhousebackend.controller;

import com.heima.chickenhousebackend.pojo.Chat;
import com.heima.chickenhousebackend.pojo.Result;
import com.heima.chickenhousebackend.pojo.User;
import com.heima.chickenhousebackend.service.ChatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChatController {

    private static final Logger log = LoggerFactory.getLogger(ChatController.class);
    @Autowired
    private ChatService chatService;

    //创建聊天组
    @PostMapping("/chat/createChat")
    public Result createChat(@RequestBody Chat chat) {
        log.info("创建聊天组：{}",chat);
        chatService.createChat(chat);
        return Result.success();
    }

    //根据uid获取所有聊天对象的信息
    @GetMapping("/chat/historyChat/{id}")
    public Result getCharUserInfo(@PathVariable Long id) {
        log.info("根据uid获取所有聊天对象的信息:{}",id);
        List<User> list = chatService.getChatUserInfo(id);
        return Result.success(list);
    }

    //查找聊天信息
    @PostMapping("/chat/getMessageList")
    public Result getMessageList(@RequestBody Chat chat) {
        log.info("查找聊天信息:{}",chat);
        List<Chat> chats = chatService.getChatList(chat);
        return Result.success(chats);
    }

    //将二者聊天信息存入表
    @PostMapping("/chat/sendMessage")
    public Result sendMessage(@RequestBody Chat chat) {
        log.info("将二者聊天信息存入表:{}",chat);
        chatService.saveChat(chat);
        return Result.success();
    }

    //根据用户id获取聊天对象的信息
    @GetMapping("/chat/otherInfo/{id}")
    public Result getUserInfoById(@PathVariable Long id) {
        log.info("获取聊天对象的信息:{}",id);
        User user = chatService.getUserInfoById(id);
        return Result.success(user);
    }


}
