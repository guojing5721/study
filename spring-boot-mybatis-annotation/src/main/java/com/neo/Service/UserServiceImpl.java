package com.neo.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neo.dao.UserDao;
import com.neo.entity.UserEntity;
import com.neo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by guojing on 2017/6/10.
 */
@Service
public class UserServiceImpl implements UserService{
   /* @Autowired
    private UserMapper userMapper;*/
    @Autowired
    private UserDao userDao;
    /*@Override
    public List<UserEntity> getAll() {
        return userMapper.selectAll();
    }*/
    public List<UserEntity> getAll(){

        return userDao.getAll();
    }

    @Override
    public PageInfo<UserEntity> getPage() {
        PageHelper.startPage(1,2);
        List<UserEntity> result = userDao.getAll();
        return new PageInfo<UserEntity>(result);
    }

}
