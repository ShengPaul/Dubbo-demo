package com.google.impl;

import com.google.IUserApi;
import com.google.utils.JsonResult;
import com.xt.dao.UserMapper;
import com.xt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserApi {

    @Resource
    private UserMapper userMapper;

    @Override
    public JsonResult<User> getUsers(Integer id) {
        JsonResult<User> jsonResult = new JsonResult<>();
        User user = null;
        try {
            user = userMapper.selectByPrimaryKey(id);
            jsonResult.setResult(user);
        }catch (Exception e){
            jsonResult.setErrorCode("500");
            jsonResult.setMsg(e.getMessage());
            e.printStackTrace();
        }
        if(user==null){
            jsonResult.setErrorCode("110");
            jsonResult.setMsg("没有查到该用户信息");
        }
       return jsonResult;
    }
}
