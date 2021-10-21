package org.linkedinlearning.functionalprogramming.streamoperations;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class FilteringStreams {

    public static void main(String[] args) {

        var randoms = Stream.generate(new Random()::nextInt);

        randoms.distinct()
                .filter(n -> n>0)
                .limit(10)
                .forEach(System.out::println);

        // Employees with at most 1700: scans whole stream

        Arrays.stream(Employee.getData())
                .sorted(Comparator.comparing(Employee::getSalary))
                .filter(e -> e.getSalary() <= 1700)
                .forEach(System.out::println);


    }
}
