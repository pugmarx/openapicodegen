package org.pgmc.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.util.TableUtils;
import org.pgmc.bean.Person;
import org.pgmc.repos.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class PersonService {

    private static final Logger logger = LoggerFactory.getLogger(PersonService.class);

    @Autowired
    private DynamoDBMapper mapper;

    @Autowired
    private AmazonDynamoDB amazonDynamoDB;

    @Autowired
    PersonRepository repository;

    private void setUp(){
        CreateTableRequest tableRequest = mapper.generateCreateTableRequest(Person.class);
        tableRequest.setProvisionedThroughput(new ProvisionedThroughput(1L, 1L));
        boolean created = TableUtils.createTableIfNotExists(amazonDynamoDB, tableRequest);
        logger.debug("Is the Person table created:::::"+created);
    }

    public void persist(Person person) {
        setUp();

        // call DAO and persist
        logger.info("--> Storing:" + person);
        repository.save(person);

//        logger.info("--> Iterating:" + person);
//        //for(Person p: repository.findAll()){
//        for(Person p: mapper. .findAll()){
//            logger.debug(p.toString());
//        }
    }
}