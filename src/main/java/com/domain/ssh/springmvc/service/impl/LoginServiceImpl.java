package com.domain.ssh.springmvc.service.impl;

import com.domain.ssh.springmvc.dao.UserDao;
import com.domain.ssh.springmvc.entity.User;
import com.domain.ssh.springmvc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserDao userDao;

    public User login(String email, String password) {
        User user  = userDao.getUserByEmail(email);
        if (user!=null) {
            if (user.getPassword().equals(password)) {
                return  user;
            }
        }
        return null;
    }
}
