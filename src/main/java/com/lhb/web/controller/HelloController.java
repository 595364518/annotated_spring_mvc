package com.lhb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 14:43:24 2020/8/19
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){

        return "hello";
    }
}
