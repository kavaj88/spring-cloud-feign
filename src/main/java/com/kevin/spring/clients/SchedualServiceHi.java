package com.kevin.spring.clients;

import com.kevin.spring.clients.fallback.SchedualServiceHiHystric;
import com.kevin.spring.entity.Perpson;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Email
 *
 * @author JACK
 *
 **/


@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);


    @PostMapping("/hi")
    String putHiFromClientOne(@RequestBody Perpson p);
}

