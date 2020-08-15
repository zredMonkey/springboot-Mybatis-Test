package com.springbootmybatis.test.controller;

import com.springbootmybatis.test.mapper.AdminExtMapper;
import com.springbootmybatis.test.mapper.AdminMapper;
import com.springbootmybatis.test.model.po.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/AdminController")
public class AdminController {

    @Resource
    private AdminExtMapper adminExtMapper;

    @GetMapping("/getAdminAll")
    public List<Admin> getAdminAll(){
        return adminExtMapper.getAll();
    }

}
