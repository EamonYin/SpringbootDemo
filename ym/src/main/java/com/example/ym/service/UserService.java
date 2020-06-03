package com.example.ym.service;

import com.example.ym.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findall(String str);//查询

    List<User> findAllByPage(String str , int pageNum , int pageSize);//分页查询

    int addUser(User user);//新增

    int updateUser(User user);//修改

    int deleteUser(Integer id);//根据id删除
}
