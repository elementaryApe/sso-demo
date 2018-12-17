package com.herman.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 客户端启动类
 * @author hsh
 * @create 2018-12-17 11:16
 **/
@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SsoClientApplication {

    @GetMapping("/user")
    public Authentication user(Authentication user){
        return user;
    }
    public static void main(String[] args) {
        SpringApplication.run(SsoClientApplication.class,args);
    }
}
