package com.example.springbootlogindemo.controller;

import com.example.springbootlogindemo.domain.User;
import com.example.springbootlogindemo.service.servicelmpl.UserService;
import com.example.springbootlogindemo.service.utils.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Result<User> loginController(@RequestBody User u){
        User user = userService.loginService(u.getUsername(),u.getPassword());
        if(user!=null){
            return Result.success(user,"登陆成功！");
        }else {
            return Result.error("123","账号或密码错误！");
        }
    }

    @PostMapping("/register")
    public Result<User> registController(@RequestBody User newUser){
        User user = userService.registService(newUser);
        if(user!=null){
            return Result.success(user,"注册成功！");
        }else{
            return Result.error("456","用户名已经存在！");
        }
    }
}
