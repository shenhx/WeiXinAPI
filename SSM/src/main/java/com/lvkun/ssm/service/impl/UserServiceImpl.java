package com.lvkun.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lvkun.ssm.dao.IUserDao;
import com.lvkun.ssm.pojo.User;
import com.lvkun.ssm.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}
	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return this.userDao.insert(user);
	}
	@Override
	public int updateByPrimaryKey(User user) {
		// TODO Auto-generated method stub
		return this.userDao.updateByPrimaryKey(user);
	}

}
