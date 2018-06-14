package com.zheng.service;


import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author hmx
 */

@Service(version = "1.0.0")
public class DServiceImpl implements IDubboService {

    @Override
    public String findName() {
        return "回来了";
    }
}
