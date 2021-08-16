package com.shenfeng.yxw.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yangxiaowei37
 * @Date: 16/8/2021 上午9:31
 * @Version: 1.0
 * @Description:
 */
@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String test() {
        return "test";
    }
}
