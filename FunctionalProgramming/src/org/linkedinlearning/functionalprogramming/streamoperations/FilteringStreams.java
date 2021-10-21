package org.linkedinlearning.functionalprogramming.streamoperations;

import java.util.Random;
import java.util.stream.Stream;

public class FilteringStreams {

    public static void main(String[] args) {

        var randoms = Stream.generate(new Random()::nextInt);

        randoms.filter(n -> n>0)
                .distinct()
                .limit(10)
                .forEach(System.out::println);

    }
}
