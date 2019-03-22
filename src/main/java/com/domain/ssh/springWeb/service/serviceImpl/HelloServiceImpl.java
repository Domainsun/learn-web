package com.domain.ssh.springWeb.service.serviceImpl;

import com.domain.ssh.springWeb.service.HelloService;
import org.springframework.stereotype.Service;


@Service(value = "helloService")
public class HelloServiceImpl implements HelloService {
    public void sayHi() {
        System.out.println("hello service");
    }
}
