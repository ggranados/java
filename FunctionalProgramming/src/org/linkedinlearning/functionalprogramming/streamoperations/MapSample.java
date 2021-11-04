package org.linkedinlearning.functionalprogramming.streamoperations;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.Arrays;

public class MapSample {

    public static void main(String[] args) {

        Arrays.stream(Employee.getData())
                .map(Employee::getName)
                .map(n->n.charAt(0))
                .map(c -> c.hashCode())
                .forEach(System.out::println);

    }
}
