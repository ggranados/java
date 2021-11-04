package org.linkedinlearning.functionalprogramming.fis;

import java.util.function.Function;

public class FunctionCompose {
    public static void main(String[] args) {

        Function<String,Character> f = s -> s.charAt(0);
        Function<Character, Integer> g = c -> c.hashCode();

        Function both = f.andThen(g);

        System.out.println(both.apply("String"));

        System.out.println(f.andThen(g).apply("String"));

        Function composed = g.compose(f);

        System.out.println(composed.apply("String "));
    }
}
