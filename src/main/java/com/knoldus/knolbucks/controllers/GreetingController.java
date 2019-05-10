package com.knoldus.knolbucks.controllers;

import com.knoldus.knolbucks.service.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Autowired
	@Qualifier(value ="greetingServiceImpl")
    private GreetingService greetingService;

    @RequestMapping(value = "/knolbucks")
    public String getGreetings() {

        return greetingService.getGreetings();

    }
}
