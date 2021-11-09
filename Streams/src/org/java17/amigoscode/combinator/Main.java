package org.java17.amigoscode.combinator;

import java.time.LocalDate;

import static org.java17.amigoscode.combinator.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Customer customer = new Customer(
                "Alice",
                "alicegmail.com",
                "+089845631234",
                LocalDate.of(2000,1,1)
        );

        //System.out.println(new CustomerValidator().isValid(customer));

        ValidationResult result =
                isEmailValid()
                .and(isPhoneNumberValid())
                .and(idAdult())
                .apply(customer);

        if (result != ValidationResult.SUCCESS){
            throw new IllegalAccessException(result.name());
        }
    }
}