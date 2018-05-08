package com.example.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController controller 里的方法都是以json格式输出
 */
@RestController
public class TestController {
    Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/helloWorld")
    public String helloWorld(){
        logger.debug("hello world");
        return "helloWorld";
    }
}
