package com.hxy.dao;

import com.hxy.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> findAll();
}
