package org.pgmc.repos;

import org.pgmc.bean.Person;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface PersonRepository extends
        CrudRepository<Person, Long> {

    Optional<Person> findById(Long id);
}