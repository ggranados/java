package org.linkedinlearning.functionalprogramming.parallelstreamoperations;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.Arrays;

public class MapSample {

    public static void main(String[] args) {

        var totalSalary = Arrays.stream(Employee.getData())
                .parallel()
                .mapToInt(Employee::getSalary)
                .peek((x)-> System.out.println(Thread.currentThread().getId())) //prints the thread id running
                .sum();

        System.out.println("Total:"+totalSalary);
    }

}