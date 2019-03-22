package com.domain.ssh.springWeb.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "helloDao")
public class HelloDaoImpl implements HelloDao {
    public void dao() {
        System.out.println("hello dao");
    }
}
