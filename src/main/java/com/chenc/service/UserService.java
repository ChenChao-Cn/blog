package com.chenc.service;

import com.chenc.entity.User;

/**
 * @Author Chenc
 * @Date 2020/11/25
 * @Description AUTO
 * @Version 1.0
 */
public interface UserService {

    User checkUser(String username,String password);
}
