package com.example.demo;

import com.example.model.Person;
import com.example.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private PersonRepository personRepository;


	@Test
	void findAll() {
		List<Person> pList=personRepository.findAll();
		assertEquals(2,pList.size());
	}

	@Test
	void insertPerson() {
		Person p=new Person();
		p.setFirstName("Z");
		p.setLastName("Khan");
		personRepository.save(p);
		List<Person> pList=personRepository.findAll();
		assertEquals(3,pList.size());
	}


}
