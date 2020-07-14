package com.hxy.controller;

import com.hxy.bean.User;
import com.hxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/listAll")
    public String findAlls(Model model){
        List<User> users=userService.findAll();
        model.addAttribute("users",users);
        return "userList";
    }


}
