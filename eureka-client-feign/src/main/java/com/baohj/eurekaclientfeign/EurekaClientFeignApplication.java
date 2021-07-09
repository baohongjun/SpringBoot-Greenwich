package com.baohj.eurekaclientfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author DELL
 */
@SpringBootApplication
@EnableDiscoveryClient          //注册
@EnableFeignClients             //开启feign功能
public class EurekaClientFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientFeignApplication.class, args);
    }

}
