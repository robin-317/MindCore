package com.heima.chickenhousebackend.mapper;

import com.heima.chickenhousebackend.pojo.Chat;
import com.heima.chickenhousebackend.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ChatMapper {

    //创建聊天组
    void createChat(Chat chat);
    //判断聊天组是否存在
    Chat getChatByUsers(Long minId, Long maxId);

    //根据uid获取所有聊天对象的信息
    List<User> getChatUserInfo(Long id);

    //查找聊天信息
    List<Chat> getChatList(Chat chat);

    //将二者聊天信息存入表
    void saveChat(Chat chat);

    //根据用户id获取聊天对象的信息
    User getUserInfoById(Long id);



    void updateChat(Chat chat);
}
