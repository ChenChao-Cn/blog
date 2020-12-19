package com.chenc.service.impl;

import com.chenc.dao.UserRepository;
import com.chenc.entity.User;
import com.chenc.service.UserService;
import com.chenc.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Chenc
 * @Date 2020/11/25
 * @Description AUTO
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
