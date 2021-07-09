package com.baohj.consulconsumer.service;

import com.baohj.consulconsumer.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: baohj
 * created time: 2021/7/7 17:09
 * description
 */
@Service
public class ConsulConsumerService {

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name){
        return  eurekaClientFeign.sayHiFromClientEureka(name);
    }

}
