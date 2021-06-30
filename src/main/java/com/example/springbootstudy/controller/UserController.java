package com.example.springbootstudy.controller;

import com.example.springbootstudy.entity.User;
import com.example.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    UserService userService;
    //请求所有
    @GetMapping("queryAllIo")
    public ArrayList<User> queryAllIo(){
        return userService.queryAllIo();
    }
    //根据条件查询
    @GetMapping("/queryUserById")
    public List<User> queryDeviceById(@RequestParam("id")int id){
        if (id != 0){
            return userService.queryUserById(id);
        }else {
            return userService.queryAllIo();
        }
    }
    //插入
    @PostMapping("addUser")
    int addDevice(@RequestParam("userid")int userid,
                  @RequestParam("name")String name){
        return userService.insertUser(userid,name);
    }

}
