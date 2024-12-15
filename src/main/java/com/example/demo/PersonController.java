package com.example.demo.controllers;

import com.example.demo.Person;
import com.example.demo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/persons")
    public Person createPerson(@RequestBody Person person) {
       Person savedperson = personRepository.save(person);
        System.out.println(savedperson.getName());
        return savedperson;
    }

    @GetMapping("/persons")
    public Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }
    

}