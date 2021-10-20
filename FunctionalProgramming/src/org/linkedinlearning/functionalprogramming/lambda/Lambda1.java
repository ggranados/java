package org.linkedinlearning.functionalprogramming.lambda;

import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.Comparator;

public class Lambda1 {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // old fashion anonymous class implementation
        Comparator<Employee> byName = new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                return a.getName().compareTo(b.getName());
            }
        };

        // First lambda expression
        Comparator<Employee> byNameLambda1 =
                (Employee a, Employee b) -> {return a.getName().compareTo(b.getName()); };

        // Removing parameter types
        Comparator<Employee> byNameLambda2 =
                (a,b) -> { return a.getName().compareTo(b.getName()); };

        // Removing braces and return
        Comparator<Employee> byNameLambda3 =
                (a,b) -> a.getName().compareTo(b.getName());

    }
}
