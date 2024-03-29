package org.java17.amigoscode.optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        var value = Optional.ofNullable("Hello")
                .orElseGet(() -> "default");

        //System.out.println(value);

        //Optional.ofNullable(null)
        //        .orElseThrow(() -> new IllegalArgumentException());


        Optional.ofNullable("Hello")
                .ifPresent(val -> {
                    //System.out.println(val);
                });


        Optional.ofNullable(null)
                .ifPresentOrElse( System.out::println,
                        () -> System.out.println("null value"));
    }
}