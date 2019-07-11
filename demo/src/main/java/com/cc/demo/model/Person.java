package com.cc.demo.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



 @Entity
 @Table(name="People")
public class Person {
    @Id
    private UUID id;

    private String name;
}