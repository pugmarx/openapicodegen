package org.pgmc.service;

import org.pgmc.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class PersonService {

    private static final Logger logger = LoggerFactory.getLogger(PersonService.class);

    public void persist(Person person) {
        // call DAO and persist
        logger.info("--> Persistence logic comes here for person:" + person);
    }
}
