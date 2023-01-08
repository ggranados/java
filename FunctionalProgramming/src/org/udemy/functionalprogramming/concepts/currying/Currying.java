package org.udemy.functionalprogramming.concepts.currying;

import org.linkedinlearning.functionalprogramming.streamoperations.FilteringStreams;

import java.util.function.Function;

public class Currying {
    public static void main(String[] args) {

        Function<Integer, Function<Integer, Integer>> f1 = u-> v-> u + v;

        System.out.println(f1.apply(2).apply(3));

        Function<Integer, Integer> f2 = f1.apply(2);
        System.out.println(f2.apply(3));
        System.out.println(f2.apply(1));

        //

        Function<Integer, Function<Integer, Function<Integer,Integer>>> f3 = u -> v -> w -> u + v + w;

        System.out.println(f3.apply(1).apply(2).apply(3));

        Function<Integer, Function<Integer, Integer>> f4 = f3.apply(1);
        Function<Integer,Integer> f5 = f4.apply(2);

        System.out.println(f5.apply(3));


    }
}
