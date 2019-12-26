package com.example.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WelcomeService {

    public String generateWelcomeMessage(){
        log.debug("We are in welcome service.");
        return "Hello world! Nice to see you.";
    }


}
