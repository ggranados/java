package org.linkedinlearning.functionalprogramming.streamoperations;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.Arrays;
import java.util.stream.Stream;

public class CollectSample {
    public static void main(String[] args) {

        var result = Arrays.stream(Employee.getData())
                .unordered()
                .parallel()
                .flatMap(e-> Stream.of(e.getName()))
                .collect(
                        StringBuilder::new,   //factory
                        StringBuilder::append,  //accumulator
                        StringBuilder::append   // combiner (for parallel)
                );

        System.out.println(result);

    }
}
