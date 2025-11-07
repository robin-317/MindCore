package com.heima.chickenhousebackend.controller;

import com.heima.chickenhousebackend.pojo.LoginInfo;
import com.heima.chickenhousebackend.pojo.Result;
import com.heima.chickenhousebackend.pojo.User;
import com.heima.chickenhousebackend.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;

    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    //用户登录操作
    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        log.info("用户登录:{}",user);
        LoginInfo info = userService.login(user);
        if(info != null) {
            return Result.success(info);
        }
        return Result.error("用户名或密码错误");
    }

    @PostMapping("/token")
    public Result userToken(@RequestBody User user) {
        log.info("登录后查询信息");
        User user1 = userService.getInfo(user);
        return Result.success(user1);
    }


}
