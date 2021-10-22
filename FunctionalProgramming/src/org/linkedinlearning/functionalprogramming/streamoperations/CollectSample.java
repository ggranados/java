package org.linkedinlearning.functionalprogramming.streamoperations;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectSample {
    public static void main(String[] args) {

        var result = Arrays.stream(Employee.getData())
                .unordered()
                .parallel()
                .flatMap(e-> Stream.of(e.getName()))
                .collect(
                    Collectors.joining(",")
                );

        System.out.println(result);

    }
}
