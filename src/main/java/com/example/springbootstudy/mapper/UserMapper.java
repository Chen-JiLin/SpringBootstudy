package com.example.springbootstudy.mapper;

import com.example.springbootstudy.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface UserMapper {
    //查询所有记录
    @Select("select * from users")
    ArrayList<User> queryAllIo();

    //根据条件查值
    @Select("select * from users where userid = #{id}")
    List<User> queryUserById(@Param("id")int id);

    //插入
    @Insert("insert into users (userid,name) values (#{userid},#{name})")
    int insertUser(@Param("userid")int userid,
                     @Param("name")String name);
}
