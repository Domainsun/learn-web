package com.domain.ssh.springmvc.test;

import org.junit.Test;
import org.springframework.util.DigestUtils;

public class DegiTest {

    @Test
    public void testDegist(){
        System.out.println(DigestUtils.md5Digest("123".getBytes()));
    }
}
