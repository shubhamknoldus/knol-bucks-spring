package com.knoldus.knolbucks.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String getGreetings() {

        return "Hello Knolbucks";
    }


}
