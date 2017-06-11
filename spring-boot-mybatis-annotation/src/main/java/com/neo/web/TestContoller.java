package com.neo.web;

import com.neo.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guojing on 2017/6/10.
 */
@RestController
@RequestMapping(value = "test")
public class TestContoller {

    @RequestMapping(value = "hello")
    public String hello(String value, UserEntity user){
        return "Hello "+value+" "+user.getName();
    }
}
