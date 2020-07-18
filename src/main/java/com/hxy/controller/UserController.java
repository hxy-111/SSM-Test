package com.hxy.controller;

import com.hxy.bean.User;
import com.hxy.service.UserService;
import com.hxy.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/page")
public class UserController {

    @Autowired
    private AjaxResult ajaxResult;
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public @ResponseBody AjaxResult login(@RequestBody User user){
        if(userService.login(user)){
            ajaxResult.ajaxTrue("登录成功");
        } else {
            ajaxResult.ajaxFalse("登录失败");
        }
        return ajaxResult;
    }



}
