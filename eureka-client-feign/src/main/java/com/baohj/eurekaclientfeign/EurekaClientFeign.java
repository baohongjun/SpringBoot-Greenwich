package com.baohj.eurekaclientfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: baohj
 * created time: 2021/7/8 10:12
 * description
 */
@FeignClient(value = "eureka-client")
public interface EurekaClientFeign {

    @GetMapping(value = "/hi")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);

}
