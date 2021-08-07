package com.ashok.microservices.controller;

import com.ashok.microservices.bean.CurrencyExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @GetMapping(path = "/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
        CurrencyExchange currencyExchange = new CurrencyExchange(100L, "INR", "EURO", BigDecimal.TEN);

        currencyExchange.setEnvironment(environment.getProperty("local.server.port"));

        return currencyExchange;
    }

}
