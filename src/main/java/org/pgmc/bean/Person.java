package org.pgmc.bean;

import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.CreditCardNumber;

@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)

@Getter @Setter @ToString @AllArgsConstructor
@DynamoDBTable(tableName = "Person")
public class Person {
    @DynamoDBHashKey
    private Long id;

    @DynamoDBAttribute
    private String firstName;

    @NotNull @NotBlank
    @DynamoDBAttribute
    private String lastName;

    @Email
    @DynamoDBAttribute
    private String email;

    @Min(value = 18, message = "{age.min}")
    @Max(value = 120, message = "{age.max}")
    @DynamoDBAttribute
    private Integer age;

    @CreditCardNumber
    @DynamoDBAttribute
    private String creditCardNumber;
}