package com.bj.controller;

import com.bj.pojo.Users;
import com.bj.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("register")
    public String register(Users users){
        try {
            userService.insertInfo(users);
            return "reSuccess";
        }catch (Exception e){
            return "fail";
        }
    }
    @RequestMapping("login")
    public String login(Model model, Users users) {
        Users user = userService.findByNamePsw(users);
        if (users != null) {
            model.addAttribute("username", user.getUsername());
            return "success";
        } else {
            return "fail";
        }
    }

}
