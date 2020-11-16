package org.pgmc.exception;

public class PersonNotFoundException extends Exception {
    public PersonNotFoundException(Long id) {
        super("Could not find person " + id);
    }
}
