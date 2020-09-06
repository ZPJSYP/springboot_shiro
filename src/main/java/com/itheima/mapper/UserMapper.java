package com.itheima.mapper;

import com.itheima.pojo.User;

public interface UserMapper {
    User findByName(String username);

    User findById(int id);
}
