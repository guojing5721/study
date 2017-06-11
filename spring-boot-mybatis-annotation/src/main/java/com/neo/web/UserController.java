package com.neo.web;

import com.github.pagehelper.PageInfo;
import com.neo.Service.UserService;
import com.neo.entity.UserEntity;
import com.neo.dao.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ComponentScan(basePackages = "com.neo.Service")
@RequestMapping(value = "user")
public class UserController {
    Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
    private UserService userService;
	@RequestMapping("/getUsers")
	public List<UserEntity> getUsers() {
        log.info("getAllUsers");
		PageInfo<UserEntity> result = userService.getPage();
        /*int i =0;
        int j = 1/i;
        log.error("divde zero!!!");*/
		return userService.getAll();
	}
	@RequestMapping(value="/getPageInfo")
	public PageInfo<UserEntity> getPageInfo(){
		return userService.getPage();
	}
	/*
    @RequestMapping("/getUser")
    public UserEntity getUser(Long id) {
    	UserEntity user=userMapper.getOne(id);
        return user;
    }
    
    @RequestMapping("/add")
    public void save(UserEntity user) {
    	userMapper.insert(user);
    }
    
    @RequestMapping(value="update")
    public void update(UserEntity user) {
    	userMapper.update(user);
    }
    
    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
    	userMapper.delete(id);
    }
    */
    
}