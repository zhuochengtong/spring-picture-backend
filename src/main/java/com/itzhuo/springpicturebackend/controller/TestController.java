package com.itzhuo.springpicturebackend.controller;

import com.itzhuo.springpicturebackend.common.ActionResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/test1")
    public void test1(){
        System.out.println(1/0);
    }

    public ActionResult<String> test2(){
        return ActionResult.success("");
    }
}
