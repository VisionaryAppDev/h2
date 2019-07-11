package com.cc.demo.controller;

import com.cc.demo.model.Person;
import com.cc.demo.service.PersonService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService)
    {
        this.personService = personService;
    }


    @GetMapping("/people")
    public Iterable<Person> getAllPeople(){
        return personService.findAll();
    }
    


}