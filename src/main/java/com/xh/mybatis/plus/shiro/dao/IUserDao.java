package com.xh.mybatis.plus.shiro.dao;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.xh.mybatis.plus.shiro.model.User;

public interface IUserDao extends BaseMapper<User> {

	List<User> selectPageList(Pagination pagination);
}
