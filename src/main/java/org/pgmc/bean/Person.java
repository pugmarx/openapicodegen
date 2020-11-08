package org.pgmc.bean;

import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.CreditCardNumber;

@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)

@Getter @Setter
public class Person {
    private long id;
    private String firstName;

    @NotNull @NotBlank
    private String lastName;

    @Email
    private String email;

    @Min(value = 18, message = "{age.min}")
    @Max(value = 120, message = "{age.max}")
    private int age;

    @CreditCardNumber
    private String creditCardNumber;
}