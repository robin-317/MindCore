package com.heima.chickenhousebackend.service;

import com.heima.chickenhousebackend.pojo.Chat;
import com.heima.chickenhousebackend.pojo.User;

import java.util.List;

public interface ChatService {

    //创建聊天组
    void createChat(Chat chat);

    //根据uid获取所有聊天对象的信息
    List<User> getChatUserInfo(Long id);

    //查找聊天信息
    List<Chat> getChatList(Chat chat);

    //将二者聊天信息存入表
    void saveChat(Chat chat);

    //根据用户id获取聊天对象的信息
    User getUserInfoById(Long id);
}
