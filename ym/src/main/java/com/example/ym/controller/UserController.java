package com.example.ym.controller;


import com.example.ym.pojo.User;
import com.example.ym.service.Impl.UserServiceImp;
import com.example.ym.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserServiceImp usi;

    @RequestMapping("/select")
    @ResponseBody
    private List<User> getAllUser(HttpServletRequest request) {
        String str = request.getParameter("str");
        List<User> findall = usi.findall(str);
        System.out.println(findall);
        return findall;
    }
}
