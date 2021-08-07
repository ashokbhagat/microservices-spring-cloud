package com.ashok.microservices.controller;

import com.ashok.microservices.bean.CurrencyExchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @GetMapping(path="/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retriveExchangeValue(@PathVariable String from, @PathVariable String to){
        return new CurrencyExchange(100L, "INR", "EURO" , BigDecimal.TEN);
    }

}
