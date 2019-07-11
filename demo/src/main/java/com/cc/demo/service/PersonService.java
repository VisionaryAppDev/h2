package com.cc.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.cc.demo.model.Person;

public interface PersonService {
    Iterable<Person> findAll();

    Optional<Person> findById(UUID id);
}