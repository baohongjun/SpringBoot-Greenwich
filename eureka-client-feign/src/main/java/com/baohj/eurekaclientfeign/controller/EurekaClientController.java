package com.baohj.eurekaclientfeign.controller;

import com.baohj.eurekaclientfeign.service.EurekaClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: baohj
 * created time: 2021/7/8 10:16
 * description
 */
@RestController
public class EurekaClientController {

    @Autowired
    EurekaClientService eurekaClientService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name){
        return eurekaClientService.sayHi(name);
    }


}
