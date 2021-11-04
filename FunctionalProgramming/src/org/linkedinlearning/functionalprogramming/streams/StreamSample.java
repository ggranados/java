package org.linkedinlearning.functionalprogramming.streams;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.Arrays;
import java.util.Comparator;

public class StreamSample {

    public static void main(String[] args) {
        Arrays.stream(Employee.getData())
                .filter(e -> e.getSalary() >= 500)
                .map(e -> e.getName())
                .sorted()
                .forEach(System.out::println);
    }
}
