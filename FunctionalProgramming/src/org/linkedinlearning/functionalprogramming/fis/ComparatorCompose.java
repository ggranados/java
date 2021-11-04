package org.linkedinlearning.functionalprogramming.fis;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorCompose {
    public static void main(String[] args) {

        Comparator<Employee>
                byName = Comparator.comparing(Employee::getName);

        Comparator<Employee>
                bySalary = Comparator.comparingInt(Employee::getSalary);

        Comparator
                byNameAndSalary = byName.thenComparing(bySalary);

        System.out.println("byName");
        Arrays.stream(Employee.getData()).sorted(byName).forEach(System.out::println);
        System.out.println("bySalary");
        Arrays.stream(Employee.getData()).sorted(bySalary).forEach(System.out::println);
        System.out.println("byNameAndSalary");
        Arrays.stream(Employee.getData()).sorted(byNameAndSalary).forEach(System.out::println);

    }
}
