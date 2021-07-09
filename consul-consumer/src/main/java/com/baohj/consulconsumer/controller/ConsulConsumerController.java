package com.baohj.consulconsumer.controller;

import com.baohj.consulconsumer.service.ConsulConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: baohj
 * created time: 2021/7/7 17:10
 * description
 */
@RestController
public class ConsulConsumerController {

    @Autowired
    ConsulConsumerService consulConsumerService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name){
        return consulConsumerService.sayHi(name);
    }

}
