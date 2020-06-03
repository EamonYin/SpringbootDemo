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

    /**
     * 模糊查询用户
     * @param request
     * @return
     */
    @RequestMapping("/select")
    @ResponseBody
    private List<User> getAllUser(HttpServletRequest request) {
        String str = request.getParameter("str");
        List<User> findall = usi.findall(str);
        System.out.println(findall);
        return findall;
    }

    /**
     * 分页查询
     * @param request
     * @return
     */
    @RequestMapping("/selectByPage")
    @ResponseBody
    private List<User> getAllUserByPage(HttpServletRequest request,int num){
        String str = request.getParameter("str");
        List<User> allByPage = usi.findAllByPage(str, num, 2);
        return allByPage;
    }

    /**
     * 删除用户
     * @param request
     * @return
     */
    @RequestMapping("/deleteUserByid")
    @ResponseBody
    private int deleteUserByid(HttpServletRequest request){
        String id = request.getParameter("id");
        int i = usi.deleteUser(Integer.valueOf(id));
        return i;
    }

    /**
     * 更新用户
     * @param user
     * @return
     */
    @RequestMapping("/updateUser")
    @ResponseBody
    private int updateUser(User user){
//        User user1 = new User(1,"哆啦A梦",12);
        int i = usi.updateUser(user);
        return i;
    }

    /**
     * 新增用户
     * @param user
     * @return
     */
    @RequestMapping("/addUser")
    @ResponseBody
    private int addUser(User user){
        int i = usi.addUser(user);
        return i;
    }

}
