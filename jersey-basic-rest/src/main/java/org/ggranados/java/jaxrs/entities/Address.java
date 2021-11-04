package org.ggranados.java.jaxrs.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Address {

    private String street;
    private Integer number;
    private String city;
    private String country;

}