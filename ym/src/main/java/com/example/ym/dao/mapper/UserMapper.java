package com.example.ym.dao.mapper;

import com.example.ym.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface UserMapper {
    List<User> findall(@Param("str") String str);//查询

    void addUser(User user);//新增

    void updateUser(User user);//修改

    int deleteUser(Integer id);//根据id删除
}
