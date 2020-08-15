package com.springbootmybatis.test.mapper;

import com.springbootmybatis.test.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User getUserById(@Param("id") String id);
}