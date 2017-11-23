package zhu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import zhu.entity.User;
import zhu.service.UserServiceI;

@Controller
@RequestMapping("user")
public class UserController {

	@Resource
	private UserServiceI userService;
	
	@RequestMapping("/showUser/{id}")
	public String toIndex(@PathVariable Integer id ,HttpServletRequest request){  
        User user = userService.getUserById(id);
        request.setAttribute("user", user);
        return "showUser"; 
	}
}
