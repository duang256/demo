package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class
 *
 * @author yanyue
 * @date 2023/9/8
 */
@RestController
public class DemoController {
    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}
