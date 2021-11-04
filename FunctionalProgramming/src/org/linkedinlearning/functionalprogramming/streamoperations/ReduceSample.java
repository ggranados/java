package org.linkedinlearning.functionalprogramming.streamoperations;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReduceSample {
    public static void main(String[] args) {

        int totalSalaries = Arrays.stream(Employee.getData())
                .flatMap(e-> Stream.of(e.getSalary()))
                .reduce(0, Integer::sum);

        System.out.println(totalSalaries);
    }
}
