package com.domain.ssh.springmvc.dao;


import com.domain.ssh.springmvc.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
     User getUserByEmail(String email);
}
