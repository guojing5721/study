package com.neo.dao;

import com.neo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by guojing on 2017/6/11.
 */
@Mapper
public interface UserDao /* extends MyMapper<UserEntity>*/ {
    @Select("SELECT * FROM sys_user")
    @Results({
            @Result(property = "userName",  column = "username"),
            @Result(property = "name", column = "name")
    })
    List<UserEntity> getAll();
}
