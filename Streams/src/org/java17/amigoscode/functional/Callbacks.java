package org.java17.amigoscode.functional;

import java.util.Objects;
import java.util.function.Consumer;

public class Callbacks {

    public static void main(String[] args) {

        hello("John", null, value -> {
            System.out.println("no lastName provided for" + value);
        });

        helloParallel("John", null, () -> {
            System.out.println("no lastName provided");
        });

    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if(Objects.nonNull(lastName)){
            System.out.println(lastName);
        }else{
            callback.accept(firstName);
        }
    }

    static void helloParallel(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);
        if(Objects.nonNull(lastName)){
            System.out.println(lastName);
        }else{
            callback.run();
        }
    }
}