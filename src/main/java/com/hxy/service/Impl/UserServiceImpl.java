package com.hxy.service.Impl;

import com.hxy.bean.User;
import com.hxy.dao.UserMapper;
import com.hxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public boolean login(User user) {
        if(userMapper.login(user.getUsername(),user.getPassword())==null){
            return false;
        }
        return true;
    }
}
