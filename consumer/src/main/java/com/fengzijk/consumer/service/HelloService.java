package com.fengzijk.consumer.service;

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

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider")
public interface HelloService {
    @RequestMapping("/sayhello")
    String sayhello();
}
