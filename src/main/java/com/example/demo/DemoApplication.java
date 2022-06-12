package com.example.demo;

import com.example.demo.repository.PersonRepository;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person person = new Person();
		person.setName("Test");
		person.setLastName("test2");

		personRepository.save(person);

		List<Person> persons = personRepository.findAll();

		persons.forEach(p -> System.out.println(p.toString()));
	}
}
