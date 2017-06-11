package com.neo.dao;


import com.neo.entity.UserEntity;
import com.neo.enums.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*@Mapper*/
public interface UserMapper/* extends MyMapper<UserEntity>*/{
	
	@Select("SELECT * FROM sys_user")
	@Results({
		@Result(property = "userName",  column = "username"),
		@Result(property = "name", column = "name")
	})
    List<UserEntity> getAll();
	
	@Select("SELECT * FROM users WHERE id = #{id}")
	@Results({
		@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
		@Result(property = "nickName", column = "nick_name")
	})
	UserEntity getOne(Long id);

	@Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
	void insert(UserEntity user);

	@Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
	void update(UserEntity user);

	@Delete("DELETE FROM users WHERE id =#{id}")
	void delete(Long id);

}