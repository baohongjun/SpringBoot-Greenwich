package com.baohj.consulprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: baohj
 * created time: 2021/7/7 17:38
 * description
 */
@RestController
@RefreshScope       //动态刷新配置
public class FooBarController {

    @Value("${foo.bar}")
    String fooBar;

    @GetMapping("/foo")
    public String getFooBar() {
        return fooBar;
    }
}
