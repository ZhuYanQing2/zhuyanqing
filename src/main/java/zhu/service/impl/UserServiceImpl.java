package zhu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import zhu.dao.UserMapper;
import zhu.entity.User;
import zhu.service.UserServiceI;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public User getUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int deleteUserById(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

}
