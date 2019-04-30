package cn.lj.demo.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import cn.lj.demo.model.PageData;
import cn.lj.demo.model.User;

@Repository("userDao")
public class UserDao {

    @Resource
    protected SqlSessionTemplate sqlSessionTemplate;
    
    public List<PageData> selectUser(PageData user){
        return sqlSessionTemplate.selectList("UserMapper.selectUser",user);
    }
}
