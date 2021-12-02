package com.test.liquibasedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class Controller {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping
    public Person newPerson(@RequestBody final Person person) {
        return personRepository.saveAndFlush(person);
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return (List<Person>) personRepository.findAll();
    }
}
