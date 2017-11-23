package zhu.service;

import java.util.List;

import zhu.entity.User;

public interface UserServiceI {

	public User getUserById(Integer id);
	public int deleteUserById(Integer id);
	public List<User> findAll();
}
