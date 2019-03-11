package com.fengzijk.provider.controller;

import com.fengzijk.provider.service.IhelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * -------------------------------------------------
 *
 * @ProjectName : cloud-learn
 * @Descprition : TODO
 * @Author : fengzijk
 * @email: guozhifengvip@163.com
 * @Time : 2019/3/12 1:11
 * --------------------------------------------------
 */
@RestController
@RequestMapping
public class HelloController {
@Autowired
IhelloService helloService;
    @RequestMapping("/sayhello")
    public String home() {
        return helloService.sayhello() ;
    }

}
