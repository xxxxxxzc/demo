package cn.lj.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.lj.demo.dao.UserDao;
import cn.lj.demo.model.PageData;
import cn.lj.demo.model.User;
import cn.lj.demo.util.FailResult;
import cn.lj.demo.util.Result;

@Service("userService")
public class UserService {

	@Autowired
	private UserDao userDao;
	
	
	 public String getUserMessage(String str){
	        Result result = new Result();
	        try{
	        	PageData pd = JSON.parseObject(str, PageData.class);
	            List<PageData> users = userDao.selectUser(pd);
	            result.setData(users);
	        }catch (Exception e) {
	            e.printStackTrace();
	            return JSON.toJSONString(new FailResult());
	        }
	        return JSON.toJSONString(result);
	    }
}
