package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;

    public String getName() { 
        return name; 
    }

    public int  getAge() {
        return age;
    }

    public long getId() {
        return id;
    }



    // Constructors, getters, and setters
    // ... (omitted for brevity)
}