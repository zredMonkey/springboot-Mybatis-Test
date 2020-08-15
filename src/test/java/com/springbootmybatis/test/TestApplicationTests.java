package com.springbootmybatis.test;

import com.springbootmybatis.test.mapper.AdminExtMapper;
import com.springbootmybatis.test.mapper.UserMapper;
import com.springbootmybatis.test.model.User;
import com.springbootmybatis.test.model.po.Admin;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class TestApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private AdminExtMapper adminExtMapper;

//    @Test
//    void contextLoads() throws SQLException {
//        Connection connection = dataSource.getConnection();
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("select * from user");
//        // 打印结果
//        while(resultSet.next()){
//            int id = resultSet.getInt(1);
//            String name = resultSet.getString(2);
//            System.out.println("id:" + id + " name:" + name );
//        }
//    }

    @Test
    void testUserMapper(){
        List<Admin> adminList = adminExtMapper.getAll();
        System.out.println(adminList.get(0).getId());
        System.out.println(adminList.get(0).getName());
    }

}
