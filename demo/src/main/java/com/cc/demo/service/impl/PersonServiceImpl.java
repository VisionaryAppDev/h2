package com.cc.demo.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.cc.demo.model.Person;
import com.cc.demo.repository.PersonRepository;
import com.cc.demo.service.PersonService;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepo;

    public PersonServiceImpl(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public Iterable<Person> findAll() {
        return personRepo.findAll();
    }

    @Override
    public Optional<Person> findById(UUID id) {
        return personRepo.findById(id);
    }


}