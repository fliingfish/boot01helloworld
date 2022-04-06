package com.study.boot.controller;

import com.study.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @auther 张兆星
 */
/*@ResponseBody
@Controller*/   //这两个等价于@RestController

@RestController
public class HelloController {
    @Autowired
    private Car car;

    @RequestMapping("/car")
    public  Car car(){
        return  car;
    }

    @RequestMapping("/hello")
    public  String handle01(){
        return  "hello ,Spring Boot 02";
    }
}
