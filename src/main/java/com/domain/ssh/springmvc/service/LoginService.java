package com.domain.ssh.springmvc.service;

import com.domain.ssh.springmvc.entity.User;

public interface LoginService {
    User login(String email, String password);
}
