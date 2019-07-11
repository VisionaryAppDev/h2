package com.cc.demo.repository;

import java.util.UUID;

import com.cc.demo.model.Person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, UUID>
{

}