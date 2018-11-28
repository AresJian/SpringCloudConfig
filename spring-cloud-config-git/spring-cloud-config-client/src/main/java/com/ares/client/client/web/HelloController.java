package com.ares.client.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wj
 * @Date: 2018/11/27 14:19
 * @Description:
 */
@RestController
 class HelloController {
    @Value("${ares.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from(){
        return this.hello;
    }

}
