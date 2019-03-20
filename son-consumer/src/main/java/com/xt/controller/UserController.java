package com.xt.controller;

import com.google.IUserApi;
import com.google.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private IUserApi userApi;

    @ResponseBody
    @RequestMapping("getUser")
    public JsonResult getUser(){
        JsonResult jsonResult = userApi.getUsers(1);
        System.out.println(jsonResult.getResult());
        return jsonResult;
    }
}
