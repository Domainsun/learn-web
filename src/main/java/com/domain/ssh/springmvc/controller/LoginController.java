package com.domain.ssh.springmvc.controller;

import com.domain.ssh.spring.service.UserService;
import com.domain.ssh.springmvc.commons.CookieUtils;
import com.domain.ssh.springmvc.entity.User;
import com.domain.ssh.springmvc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = {"", "/login"}, method = RequestMethod.GET)
    public String login() {

        System.out.println("controller 代码");

        return "login";
    }


    @RequestMapping(value = {"", "/login"}, method = RequestMethod.POST)
    public String login(@RequestParam String email, @RequestParam String password, @RequestParam(required = false) String isRemember, HttpServletRequest req, HttpServletResponse resp) {
        User user = loginService.login(email, password);
        //登录成功
        if (user != null) {
            System.out.println("登录成功:" + user.getUsername() + isRemember);
            req.getSession().setAttribute("user",user);
            //在客户端存储cookie
            if (isRemember != null) {
                CookieUtils.setCookie(req, resp, "userInfo", String.format("{%s:%s}", email, password), 7 * 24 * 60 * 60);
            }
            return "redirect:main";
        }
        //登录失败
        else {
             req.setAttribute("message","用户名或者密码错误");
        }
        return login();
    }
}

