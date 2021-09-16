package com.retail.sales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.retail.sales.service.RetailsService;

@RestController
@RequestMapping("/sales")
public class RetailsController {
    private RetailsService service;

    @Autowired
    public RetailsController(RetailsService service) {
        this.service = service;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String getString() {
        return "TestSuccess";
    }

    @GetMapping(value = "/netAmount", produces = MediaType.APPLICATION_JSON_VALUE)
    public double getNetPayableAmount(@RequestParam(required = false) String user, @RequestParam double amount,
                                      @RequestParam String grocery_Type) {
        System.out.println("in sales controller Method");
        return service.getNetPayableAmount(user, amount, grocery_Type);

    }

}
