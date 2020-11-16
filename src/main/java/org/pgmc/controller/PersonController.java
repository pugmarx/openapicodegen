package org.pgmc.controller;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.pgmc.exception.PersonNotFoundException;
import org.pgmc.repos.PersonRepository;
import org.pgmc.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.enterprise.inject.Produces;
import javax.validation.Valid;
import java.util.Optional;


@RestController
public class PersonController {

    Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    PersonRepository repository;

    // TODO: Validity to be checked in next layer??
    // TODO: Check error message propagation
    @RequestMapping(path = "/person", method = RequestMethod.POST)
    public Person person(@Valid @RequestBody Person person) {
        repository.save(person);
        return person;
    }

    @GetMapping("/person/{id}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Person Found"),
            @ApiResponse(responseCode = "404", description = "Invalid URL or the person does not exist")})
    Person one(@PathVariable Long id) throws PersonNotFoundException {
        return repository.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
    }
}
