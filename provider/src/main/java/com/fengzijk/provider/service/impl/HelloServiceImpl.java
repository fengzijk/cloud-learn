package com.fengzijk.provider.service.impl;


import com.fengzijk.provider.service.IhelloService;
import org.springframework.stereotype.Service;

/**
 * -------------------------------------------------
 *
 * @ProjectName : cloud-learn
 * @Descprition : TODO
 * @Author : fengzijk
 * @email: guozhifengvip@163.com
 * @Time : 2019/3/12 0:10
 * --------------------------------------------------
 */
@Service
public class HelloServiceImpl implements IhelloService {
    @Override
    public String sayhello() {
        return "hello word";
    }
}

