package com.example.springbootlogindemo.service.servicelmpl;

import com.example.springbootlogindemo.domain.User;

public interface UserService {
    User loginService(String username,String password);
    User registService(User user);
}
