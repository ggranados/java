package org.ggranados.java.jaxrs.entities;

import com.github.javafaker.Faker;
import lombok.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Address {

    private String street;
    private String number;
    private String city;
    private String country;

    public static final Faker faker = new Faker();
    public static List<Address> getAddressList() {

        List<Address> list = Stream.generate(Address::getFakeAddress)
                .limit(10)
                .collect(Collectors.toList());

        return list;
    }

    public static Address getFakeAddress(){

        var a = new Address();
        a.setCity(faker.address().city());
        a.setNumber(faker.address().streetAddressNumber());
        a.setCountry(faker.address().country());
        a.setStreet(faker.address().streetAddress());

        return a;
    }

}