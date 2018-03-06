package com.xh.mybatis.plus.shiro.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.plugins.Page;
import com.xh.mybatis.plus.shiro.model.User;
import com.xh.mybatis.plus.shiro.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-config.xml", "classpath:spring/spring-mybatis.xml",
		"classpath:spring/spring-shiro.xml" })
public class UserServiceTest {

	@Autowired
	private IUserService userService;

	@Test
	public void selectByLoginName() {
		User user = new User();
		List<User> list = userService.selectList(null);
		System.out.println(list.size());
	}

//	@Test
	public void findAll() {

		Page<User> page = new Page<User>();
		page = userService.selectPageList(page);
		System.out.println(page.getRecords());

		System.out.println();
		System.out.println(JSON.toJSON(page));
	}

}
