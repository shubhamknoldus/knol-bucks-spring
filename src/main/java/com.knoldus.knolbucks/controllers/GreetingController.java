package com.knoldus.knolbucks.controllers;

import com.knoldus.knolbucks.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class GreetingController {

    private GreetingService greetingService;

    @Inject
    public GreetingController(GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    @GetMapping(value = "/knolbucks")
    public String getGreetings() {

        return greetingService.getGreetings();

    }

}
