package com.msb.dongbao.ums.md5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * msb-dongbao-mall-parent
 */
@SpringBootTest
public class TestMD5 {

    @Autowired
    PasswordEncoder encoder;

    @Test
    public void test() {
        String pass = "pass";
        String encode = encoder.encode(pass);
        System.out.println(encode);
    }
}
