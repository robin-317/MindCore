package com.heima.chickenhousebackend.service.Impl;

import com.heima.chickenhousebackend.mapper.ChatMapper;
import com.heima.chickenhousebackend.pojo.Chat;
import com.heima.chickenhousebackend.pojo.User;
import com.heima.chickenhousebackend.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    private ChatMapper chatMapper;

    //创建聊天组
    @Override
    public void createChat(Chat chat) {
        // 统一顺序
        Long minId = Math.min(chat.getUid1(),chat.getUid2());
        Long maxId = Math.max(chat.getUid1(),chat.getUid2());

        // 先判断是否已存在
        Chat chat1 = chatMapper.getChatByUsers(minId, maxId);
        if (chat1 != null) {
            // 聊天记录已存在
            // hrow new RuntimeException("该聊天组已存在！");
            chatMapper.updateChat(chat);
        }
        // 插入新聊天
        chatMapper.createChat(chat);
    }


    //根据uid获取所有聊天对象的信息
    @Override
    public List<User> getChatUserInfo(Long id) {
        return chatMapper.getChatUserInfo(id);
    }

    //查找聊天信息
    @Override
    public List<Chat> getChatList(Chat chat) {
        return chatMapper.getChatList(chat);
    }

    //将二者聊天信息存入表
    @Override
    public void saveChat(Chat chat) {
        chat.setCreateTime(LocalDateTime.now());
        chatMapper.saveChat(chat);
    }

    //根据用户id获取聊天对象的信息
    @Override
    public User getUserInfoById(Long id) {
        return chatMapper.getUserInfoById(id);
    }
}
