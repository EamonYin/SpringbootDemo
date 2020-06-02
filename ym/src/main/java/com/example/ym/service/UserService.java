package com.example.ym.service;

import com.example.ym.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findall(String str);//查询

    void addUser(User user);//新增

    void updateUser(User user);//修改

    int deleteUser(Integer id);//根据id删除
}
