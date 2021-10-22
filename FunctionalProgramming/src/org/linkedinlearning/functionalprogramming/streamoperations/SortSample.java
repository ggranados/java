package org.linkedinlearning.functionalprogramming.streamoperations;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.Arrays;
import java.util.Comparator;

public class SortSample {
    public static void main(String[] args) {

        Arrays.stream(Employee.getData())
                .sorted(Comparator.comparing(Employee::getSalary)
                        .reversed())
                .limit(10)
                .map(Employee::getName)
                .forEach(System.out::println);

    }
}
