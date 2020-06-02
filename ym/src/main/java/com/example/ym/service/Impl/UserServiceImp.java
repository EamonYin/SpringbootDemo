package com.example.ym.service.Impl;

import com.example.ym.dao.mapper.UserMapper;
import com.example.ym.pojo.User;
import com.example.ym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findall(String str) {
        return userMapper.findall(str);
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public int deleteUser(Integer id) {
        return 0;
    }
}
