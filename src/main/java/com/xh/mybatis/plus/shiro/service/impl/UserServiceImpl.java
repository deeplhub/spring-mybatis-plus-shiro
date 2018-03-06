package com.xh.mybatis.plus.shiro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xh.mybatis.plus.shiro.dao.IUserDao;
import com.xh.mybatis.plus.shiro.model.User;
import com.xh.mybatis.plus.shiro.service.IUserService;

@Service
public class UserServiceImpl extends ServiceImpl<IUserDao, User> implements IUserService {

	@Autowired
	private IUserDao userDao;

	public List<User> selectByLoginName(User user) {
		EntityWrapper<User> wrapper = new EntityWrapper<User>(user);
		if (user.getId() != null) {
			wrapper.where("id != {0}", user.getId());
		}
		return this.selectList(wrapper);
	}

	public Page<User> selectPageList(Page<User> page) {
		page.setOrderByField("id");
		page.setAsc(false);
		List<User> list = userDao.selectPageList(page);
		page.setRecords(list);
		return page;
	}

}
