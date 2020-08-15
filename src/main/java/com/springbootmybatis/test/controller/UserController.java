package com.springbootmybatis.test.controller;

import com.springbootmybatis.test.mapper.UserMapper;
import com.springbootmybatis.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @RequestMapping("/getUserById")
    public User getUserById(String id){
        return userMapper.getUserById(id);
    }
}
