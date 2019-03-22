package com.domain.ssh.springWeb.controller;

import com.domain.ssh.spring.service.UserService;
import com.domain.ssh.springWeb.commons.SpringContext;
import com.domain.ssh.springWeb.dao.HelloDao;
import com.domain.ssh.springWeb.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/hello")
public class HelloController extends HttpServlet {

    @Resource()
    UserService userService1;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //在HelloServiceImpl 通过@Service(value = "helloService")来注入，不是像之前一样，写在xml文件，注意现在，还能直接使用注解方式来获取，因为Spring只会扫码controller，也就是被@Controller注解的类
        UserService userService = SpringContext.getBean("userService");
        userService.sayHi();


    }

}
