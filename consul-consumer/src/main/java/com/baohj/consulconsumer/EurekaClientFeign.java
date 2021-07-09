package com.baohj.consulconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: baohj
 * created time: 2021/7/7 17:08
 * description
 */
@FeignClient(value = "consul-provider")
public interface EurekaClientFeign {

    @GetMapping(value = "/hi")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);

}
