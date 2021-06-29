package com.example.springbootstudy.serviceImp;

import com.example.springbootstudy.entity.User;
import com.example.springbootstudy.mapper.UserMapper;
import com.example.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public ArrayList<User> queryAllIo() {
        return userMapper.queryAllIo();
    }

    @Override
    public List<User> queryUserById(int id){
        return userMapper.queryUserById(id);
    }

    @Override
    public int insertUser(int userid, String name) {
        return userMapper.insertUser(userid,name);
    }

}
