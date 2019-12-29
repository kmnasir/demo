package com.example.services;

import com.example.model.Person;
import com.example.repositories.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class WelcomeServiceImpl implements WelcomeService{

    @Autowired
   private PersonRepository personRepository;




    @Override
    public Person save(Person p) {
        return personRepository.save(p);
    }

    @Override
    public List<Person> findAll() {
        List<Person> persons=new ArrayList<>();
        personRepository.findAll().forEach(persons::add);
        return persons;
    }

    public String generateWelcomeMessage(){
        log.debug("We are in welcome service.");
        return "Hello world! Nice to see you.";
    }




}
