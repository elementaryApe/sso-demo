package com.herman.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hsh
 * @create 2018-12-17 11:33
 **/
@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SsoClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(SsoClient2Application.class,args);
    }

}
