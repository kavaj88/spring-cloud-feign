package com.kevin.spring.clients.fallback;


import com.kevin.spring.clients.SchedualServiceHi;
import com.kevin.spring.entity.Perpson;
import org.springframework.stereotype.Component;

/**
 * Email
 *
 * @author Kevin
 *
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry, you are fail,"+name;
    }

    @Override
    public String putHiFromClientOne(Perpson p) {
        return "post Error";
    }
}