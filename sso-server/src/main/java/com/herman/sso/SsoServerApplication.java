package com.herman.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务启动
 * @author hsh
 * @create 2018-12-17 10:36
 **/
@SpringBootApplication
public class SsoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoServerApplication.class,args);
    }

}
