package com.example.repositories;

import com.example.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
class PersonRepositoryIT {

    @Autowired
    private PersonRepository personRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findAll() {
        List<Person> pList=personRepository.findAll();
        assertEquals(2,pList.size());
    }

    @Test
    void save() {
    }
}