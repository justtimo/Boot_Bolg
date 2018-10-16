package wby.springboot.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wby.springboot.pojo.User;

import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserContoller {
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser() {
		
		User u = new User();
		u.setName("imooc2");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc2");
		u.setDesc("hello imooc2~~");
		
		return u;
	}
	

}
