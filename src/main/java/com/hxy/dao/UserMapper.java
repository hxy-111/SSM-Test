package com.hxy.dao;

import com.hxy.bean.User;
import com.hxy.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {

    User login(@Param("username") String username, @Param("password") String password);

}

