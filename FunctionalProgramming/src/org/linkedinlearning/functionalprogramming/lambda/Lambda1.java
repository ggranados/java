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



    }
}
