package com.neo.Service;

import com.github.pagehelper.PageInfo;
import com.neo.entity.UserEntity;

import java.util.List;

/**
 * Created by guojing on 2017/6/10.
 */
public interface UserService {
    public List<UserEntity> getAll();
    public PageInfo<UserEntity> getPage();
}
