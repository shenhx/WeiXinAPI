package com.lvkun.ssm.service;

import com.lvkun.ssm.pojo.User;

public interface IUserService {
	  public User getUserById(int userId);
	  public int  insert(User user);
	  public int updateByPrimaryKey(User user);
}
