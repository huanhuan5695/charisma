package com.w3cmart.controller;

import com.w3cmart.entity.User;
import com.w3cmart.service.user.UserService;
import org.omg.CORBA.Object;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/8/18.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("user")
    public String toUser(){
        return "user";
    }

    @RequestMapping("selectUserInfo")
    @ResponseBody
    public Map<String,List<Map<String, java.lang.Object>>> selectUserInfo(){
        Map<String, List<Map<String, java.lang.Object>>> map = new HashMap<String, List<Map<String, java.lang.Object>>>();
        map.put("data",userService.selectUserInfo());
        return map;
    }
    @RequestMapping("insertUser")
    @ResponseBody
    public int insertUser(HttpServletRequest request){
        String action = request.getParameter("action");
        return 1;
//        userService.insert(user);
    }
}
