package cn.lj.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;

import cn.lj.demo.model.PageData;
import cn.lj.demo.model.User;
import cn.lj.demo.services.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "",  method = RequestMethod.GET, produces = "application/json;charset=utf-8" )
	public String es(HttpServletRequest request) throws Exception {
		PageData data = new PageData(request);
		return userService.getUserMessage(JSON.toJSONString(data));
	}
	

}
