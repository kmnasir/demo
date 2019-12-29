package com.example.services;

import com.example.model.Person;

import java.util.List;

public interface WelcomeService {

    Person save(Person p);
    List<Person> findAll();

    String generateWelcomeMessage();
}
