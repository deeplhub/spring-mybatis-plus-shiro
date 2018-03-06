package com.xh.mybatis.plus.shiro.service;

import java.util.List;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.xh.mybatis.plus.shiro.model.User;

public interface IUserService extends IService<User>{

	List<User> selectByLoginName(User user);
	
	Page<User> selectPageList(Page<User> page);
	
}
