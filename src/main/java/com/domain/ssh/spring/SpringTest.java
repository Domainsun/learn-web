package com.domain.ssh.spring;

import com.domain.ssh.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 测试Spring IoC
 */
public class SpringTest {

    public static void main(String[] args) {
        // 获取 Spring 容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");

        // 从 Spring 容器中获取对象
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHi();
    }

}
