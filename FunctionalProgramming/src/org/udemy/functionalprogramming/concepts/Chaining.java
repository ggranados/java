package org.udemy.functionalprogramming.concepts;

import java.util.function.Function;

public class Chaining {

    public static void main(String[] args) {

        MyConsumer<String> c1 = System.out::println;
        MyConsumer<String> c2 = s -> System.out.println(s.toUpperCase());

        //c1.accept("Hello");
        //c1.accept("Hello");

        MyConsumer<String> c3 = s ->
        {
            c1.accept(s);
            c2.accept(s);
        };

        c3.accept("Hello");

        MyConsumer<String> c4 = c1.andThen(c2);
        c4.accept("Chaining");

        //c4 = c1.andThen(null);

        //Java Function chaining implementation
        Function<Integer,Integer> f1 = i -> i+2;
        Function<Integer,Integer> f2 = i -> i*2;

        Function<Integer,Integer> f3 = f1.andThen(f2);

        System.out.println(f3.apply(2));
    }

}
