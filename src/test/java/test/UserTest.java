package test;

import java.util.List;

import javax.annotation.Resource;
import javax.json.Json;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import zhu.entity.User;
import zhu.service.UserServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserTest {

	private static final Logger Logger = org.apache.log4j.Logger.getLogger(UserTest.class);
	
	@Resource
	private UserServiceI userService;
	
	@Test
	public void test1(){
		User user = userService.getUserById(2);
		Logger.info(JSON.toJSONString(user));
	}
	
	
	@Test
	public void test2(){
		List<User> users = userService.findAll();
		Logger.info(JSON.toJSONString(users));
	}
	
	@Test
	public void test4(){
		List<User> users = userService.findAll();
		Logger.info(JSON.toJSONString(users));
	}
}
