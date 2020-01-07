package com.kevin.spring.web;

import com.kevin.spring.clients.SchedualServiceHi;
import com.kevin.spring.entity.Perpson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Email
 *
 * @author Kevin
 **/
@RestController
@Api(value = "HiController", description = "测试")
public class HiController {


    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    @ApiOperation(value = "Get", response = String.class)
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @PostMapping("/hi")
    @ApiOperation(value = "提交", response = String.class)
    public String postHi(@RequestBody Perpson p) {
        return schedualServiceHi.putHiFromClientOne(p);
    }
}