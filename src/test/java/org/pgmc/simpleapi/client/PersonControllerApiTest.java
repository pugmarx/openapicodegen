/*
 * sample application API
 * Parent pom providing dependency and plugin management for applications built with Maven
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.pgmc.simpleapi.client;

import org.pgmc.simpleapi.client.model.Person;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * API tests for PersonControllerApi
 */
public class PersonControllerApiTest {

    private final PersonControllerApi api = new PersonControllerApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oneTest() {
        Long id = null;
        Person response = api.one(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void personTest() {
        Person p = new Person();
        p.setId(11112L);
        p.setFirstName("Test");
        p.setLastName("Test123");
        p.setAge(21);
        p.setEmail("test@test.com");
        p.setCreditCardNumber("4111111111111111");
        Person response = api.person(p);
        System.out.print(response);
        assertTrue(response!=null);
        //response.get

    }
    
}
