package com.google;

import com.google.utils.JsonResult;
import com.xt.pojo.User;

public interface IUserApi {
    JsonResult getUsers(Integer id);
}
