package com.qy105.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 小男神
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication2.class,args);
    }
}
