package com.fengzijk.consumer.controller;

import com.fengzijk.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * -------------------------------------------------
 *
 * @ProjectName : cloud-learn
 * @Descprition : TODO
 * @Author : fengzijk
 * @email: guozhifengvip@163.com
 * @Time : 2019/3/12 0:00
 * --------------------------------------------------
 */
@RestController
@RequestMapping("/")
public class Hellocontroller {
    @Autowired
    HelloService  helloService;
    @GetMapping("hello")
    public String hello() {
        return helloService.sayhello();
    }
}
