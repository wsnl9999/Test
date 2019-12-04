package com.qy105.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 小男神
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication2.class,args);
    }
}