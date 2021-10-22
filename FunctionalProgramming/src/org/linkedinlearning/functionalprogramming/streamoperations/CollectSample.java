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
                        ()-> new StringBuilder(),   //factory
                        (StringBuilder b, String s ) -> {b.append(s); b.append(",");},  //accumulator
                        (StringBuilder b1, StringBuilder b2) -> b1.append(b2)   // combiner (for parallel)
                );

        System.out.println(result.toString());

    }
}
