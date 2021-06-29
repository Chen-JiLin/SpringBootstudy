package com.example.springbootstudy.service;

import com.example.springbootstudy.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    //查询记录
    ArrayList<User> queryAllIo();

    //根据条件查询
    List<User> queryUserById(int id);

    //插入user
    int insertUser(int userid,String name);
}
