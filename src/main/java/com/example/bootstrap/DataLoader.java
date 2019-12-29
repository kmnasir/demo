package com.example.bootstrap;

import com.example.model.Person;
import com.example.services.WelcomeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final WelcomeService welcomeService;

    public DataLoader(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }


    @Override
    public void run(String... args) throws Exception {

        Person p1=new Person();
        p1.setFirstName("Nasir");
        p1.setLastName("Khan");
        Person person1 = welcomeService.save(p1);


        Person p2=new Person();
        p2.setFirstName("Tahmeena");
        p2.setLastName("Khan");
        Person person2 = welcomeService.save(p2);
    }
}
