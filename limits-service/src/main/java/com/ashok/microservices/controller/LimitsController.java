package com.ashok.microservices.controller;

import com.ashok.microservices.bean.Limits;
import com.ashok.microservices.bean.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configration;

    @GetMapping(path="/limits")
    public Limits retrieveLimits(){
        return new Limits(configration.getMin(),  configration.getMax());
    }
}
