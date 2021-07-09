package com.baohj.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: baohj
 * created time: 2021/7/8 9:59
 * description
 */
@RestController
public class EurekaClientController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String getHi(String name){
        return "hi "+name+",i am from port:" +port;
    }

}
