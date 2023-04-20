package com.example.randomapi.service;

import com.example.randomapi.dto.person.PersonResponse;
import com.example.randomapi.repository.EducationRepository;
import com.example.randomapi.repository.JobRepository;
import com.example.randomapi.repository.PersonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PersonService {


    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<PersonResponse> getPersons() {
        return personRepository.findAll().stream().map(PersonResponse::new).toList();
    }

    public PersonResponse getPersonById(@PathVariable Long id) {
        return new PersonResponse(personRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Person not found")));
    }



}
