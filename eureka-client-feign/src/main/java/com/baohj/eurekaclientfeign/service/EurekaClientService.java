package com.baohj.eurekaclientfeign.service;

import com.baohj.eurekaclientfeign.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: baohj
 * created time: 2021/7/8 10:13
 * description
 */
@Service
public class EurekaClientService {

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name){
        return  eurekaClientFeign.sayHiFromClientEureka(name);
    }

}
