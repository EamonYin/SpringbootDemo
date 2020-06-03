package com.example.ym.service.Impl;

import com.example.ym.dao.mapper.UserMapper;
import com.example.ym.pojo.User;
import com.example.ym.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;
    //查询
    @Override
    public List<User> findall(String str) {
        return userMapper.findall(str);
    }

    //分页查询
    @Override
    public List<User> findAllByPage(String str , int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> userList = userMapper.findall(str);
        return userList;
    }
    //添加用户
    @Override
    public int addUser(User user) {
        int i = userMapper.addUser(user);
        return i;
    }
    //更新用户
    @Override
    public int updateUser(User user) {
        int i = userMapper.updateUser(user);
        return i;
    }
    //根据id删除用户
    @Override
    public int deleteUser(Integer id) {
        int i = userMapper.deleteUser(id);
        return i;
    }
}
